package co.onlysystems.sms.model;

public class Actuacion {
 private Integer idRegActuacion;
 private String llaveProceso;
 private String fechaActuacion;
 private String actuacion;
 private String fechaRegistro;
 private String codRegla;
 private float cant;


 // Getter Methods 

 public Integer getIdRegActuacion() {
  return idRegActuacion;
 }

 public String getLlaveProceso() {
  return llaveProceso;
 }

 public String getFechaActuacion() {
  return fechaActuacion;
 }

 public String getActuacion() {
  return actuacion;
 }

 public String getFechaRegistro() {
  return fechaRegistro;
 }

 public String getCodRegla() {
  return codRegla;
 }

 public float getCant() {
  return cant;
 }

 // Setter Methods 

 public void setIdRegActuacion(Integer idRegActuacion) {
  this.idRegActuacion = idRegActuacion;
 }

 public void setLlaveProceso(String llaveProceso) {
  this.llaveProceso = llaveProceso;
 }

 public void setFechaActuacion(String fechaActuacion) {
  this.fechaActuacion = fechaActuacion;
 }

 public void setActuacion(String actuacion) {
  this.actuacion = actuacion;
 }

 public void setFechaRegistro(String fechaRegistro) {
  this.fechaRegistro = fechaRegistro;
 }

 public void setCodRegla(String codRegla) {
  this.codRegla = codRegla;
 }

 public void setCant(float cant) {
  this.cant = cant;
 }
}