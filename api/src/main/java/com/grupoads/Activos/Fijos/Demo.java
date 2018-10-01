/**
 * 
 */
package com.grupoads.Activos.Fijos;

import java.time.LocalDate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.grupoads.Activos.Fijos.entities.ActivoFijo;
import com.grupoads.Activos.Fijos.entities.Area;
import com.grupoads.Activos.Fijos.entities.Ciudad;
import com.grupoads.Activos.Fijos.entities.EncargadoActivo;
import com.grupoads.Activos.Fijos.entities.Persona;
import com.grupoads.Activos.Fijos.entities.TipoActivo;
import com.grupoads.Activos.Fijos.repositories.ActivoFijoRespository;
import com.grupoads.Activos.Fijos.repositories.CiudadRepository;
import com.grupoads.Activos.Fijos.repositories.EncargadoActivoRepository;
import com.grupoads.Activos.Fijos.repositories.TipoActivoRespository;
import com.grupoads.Activos.Fijos.utils.Estado;

/**
 * @author nvivasbe
 *
 */
@Component
public class Demo {

	private static final Logger log = LoggerFactory.getLogger(Demo.class);

	@Autowired
	CiudadRepository ciudadRepository;

	@Autowired
	TipoActivoRespository tipoActivoRespository;

	@Autowired
	EncargadoActivoRepository encargadoActivoRepository;

	@Autowired
	ActivoFijoRespository activoFijoRespository;

	@EventListener(ContextRefreshedEvent.class)
	public void seed() {
		log.debug("Inicio DEMO");
		Ciudad c1, c2, c3, c4, c5;
		TipoActivo t1, t2, t3, t4, t5;
		EncargadoActivo e1, e2, e3, e4, e5, e6;
		ActivoFijo a1, a2, a3;

		c1 = ciudadRepository.save(new Ciudad("Bogot�"));
		c2 = ciudadRepository.save(new Ciudad("Cali"));
		c3 = ciudadRepository.save(new Ciudad("Medell�n"));
		c4 = ciudadRepository.save(new Ciudad("Bucaramanga"));
		c5 = ciudadRepository.save(new Ciudad("Barranquilla"));

		t1 = tipoActivoRespository.save(new TipoActivo("Bienes Inmuebles"));
		t2 = tipoActivoRespository.save(new TipoActivo("Dispositivos"));
		t3 = tipoActivoRespository.save(new TipoActivo("Maquinaria"));
		t4 = tipoActivoRespository.save(new TipoActivo("Transporte"));
		t5 = tipoActivoRespository.save(new TipoActivo("Otros"));

		e1 = encargadoActivoRepository.save(new Area("Mercadeo", c1));
		e2 = encargadoActivoRepository.save(new Area("TI", c2));
		e3 = encargadoActivoRepository.save(new Area("Gerencia", c3));

		e4 = encargadoActivoRepository.save(new Persona("Nicolas", "Vivas Bernal", "1026575819"));
		e5 = encargadoActivoRepository.save(new Persona("Thor", "Odinson", "G0D-THUND3R"));
		e6 = encargadoActivoRepository.save(new Persona("Peter", "Parker", "28334818"));

		a1 = activoFijoRespository.save(new ActivoFijo(new Long(43534), "Escritorio", "Escritorio de Vidrio", t1,
				"X111", 132.54, 1.2, 1.3, 1.3, 533322.45, LocalDate.now().minusDays(1), null, "Rojo", null, Estado.DISPONIBLE));

		a2 = activoFijoRespository
				.save(new ActivoFijo(new Long(434), "Computador", "HP xxx", t2, "pqw4331s", 0.14, 0.2, 0.3, 0.3,
						33322.45, LocalDate.now().minusDays(1000), LocalDate.now(), "Azul", null, Estado.DADO_DE_BAJA));

		a3 = activoFijoRespository.save(new ActivoFijo(new Long(34), "Computador", "HP xxx", t3, "pqw4331s", 0.14,
				0.2, 0.3, 0.3, 33322.45, LocalDate.now().minusWeeks(3), null, "Azul", e1, Estado.ASIGNADO));
	}
}
