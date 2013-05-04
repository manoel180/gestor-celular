package br.com.gc.modCelular.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.imageio.stream.FileImageOutputStream;
import javax.servlet.ServletContext;

import org.primefaces.event.CaptureEvent;
import org.primefaces.model.CroppedImage;

public class ImagemUtil {
	private CroppedImage imagemRecortada;
	 private String foto;
	 private String fotoRecortada;
	 private String arquivoFoto;
	 private String arquivoFotoRecortada;
	 private boolean exibeImagemCapturada;
	 private ServletContext servletContext;
	 
	/*getters e setters*/
	 private String getNumeroRandomico() {
	     int i = (int) (Math.random() * 10000);
	     return String.valueOf(i);
	 }
	 
	 private void criaArquivo(String arquivo, byte[] dados) {
	     FileImageOutputStream imageOutput;
	     try {
	         imageOutput = new FileImageOutputStream(new File(arquivo));
	         imageOutput.write(dados, 0, dados.length);
	         imageOutput.close();
	     } catch (FileNotFoundException ex) {
	         Logger.getLogger(ImagemUtil.class.getName()).log(Level.SEVERE, null, ex);
	         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Caminho não encontrado!", "Erro"));
	     } catch (IOException ex) {
	         Logger.getLogger(ImagemUtil.class.getName()).log(Level.SEVERE, null, ex);
	         FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro ao criar arquivo!", "Erro"));
	     }
	 }
	 
	 public void recortar() {
	     verificaExistenciaArquivo(arquivoFotoRecortada);
	     fotoRecortada = "fotoRecortada" + getNumeroRandomico() + ".png";
	     arquivoFotoRecortada = servletContext.getRealPath(File.separator + "imagens" + File.separator + "tmp" + File.separator + fotoRecortada);
	     criaArquivo(arquivoFotoRecortada, imagemRecortada.getBytes());
	     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Foto RECORTADA com sucesso!", "Informação"));
	 }
	 
	 public void oncapture(CaptureEvent captureEvent) {
	     verificaExistenciaArquivo(arquivoFoto);
	     foto = "foto" + getNumeroRandomico() + ".png";
	     arquivoFoto = servletContext.getRealPath(File.separator + "imagens" + File.separator + "tmp" + File.separator + foto);
	     criaArquivo(arquivoFoto, captureEvent.getData());
	     exibeImagemCapturada = true;
	     FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Foto CAPTURADA com sucesso!", "Informação"));
	 }
	 
	 private void verificaExistenciaArquivo(String arquivo) {
	     if (arquivo != null) {
	         File file = new File(arquivo);
	         if (file.exists()) {
	             file.delete();
	         }
	     }
	 }
	 
	 public ImagemUtil() {
	     exibeImagemCapturada = false;
	     servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
	 }
}
