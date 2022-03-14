package org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio;

import java.util.List;
import javax.naming.OperationNotSupportedException;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.IFuenteDatos;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Aula;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Permanencia;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Profesor;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio.Reserva;

public interface IReservas extends IFuenteDatos {
	
	public void comenzar();
	public void terminar();
	public  List<Reserva> getReservas();
	public int getNumReservas();
	public void insertar (Reserva reservas) throws OperationNotSupportedException; 
	public Reserva buscar(Reserva reservas);
	public void borrar(Reserva reservas) throws OperationNotSupportedException;
	public List<String> representar();
	public List<Reserva> getReservasProfesor(Profesor profesor);
	public List<Reserva> getReservasAula(Aula aula);
	public List<Reserva> getReservasPermanencia(Permanencia permanencia);
	public boolean consultarDisponibilidad(Aula aula, Permanencia permanencia);
}
