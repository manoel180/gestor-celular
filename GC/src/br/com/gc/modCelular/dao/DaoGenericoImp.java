package br.com.gc.modCelular.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

public class DaoGenericoImp<T> implements DaoGenerico<T> {

		
	@PersistenceContext(unitName="GC")
	private EntityManager entityManager;

	private Class<T> t;
	
	@SuppressWarnings("unchecked")
	public DaoGenericoImp() {
		t = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass())
				.getActualTypeArguments()[0];
	}

	@Override
	public void salvar(T object) {
		try {
			entityManager.persist(object);
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
	}

	@Override
	public T pesquisarPorId(Object id) {
		return entityManager.find(t, id);
	}

	@Override
	public void editar(T object) {
		try {
			entityManager.merge(object);
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
	}

	@Override
	public void excluir(Object id) {
		try {
			entityManager.remove(entityManager.getReference(t, id));
		} finally {
			if (entityManager != null) {
				entityManager.close();
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> listTodos() {
		Query query = entityManager.createQuery("FROM " + t.getSimpleName());
		return query.getResultList();
	}

}
