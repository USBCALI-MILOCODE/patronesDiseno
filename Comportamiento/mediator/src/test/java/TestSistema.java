import com.mediator.Radio;
import com.mediator.Telefono;
import com.mediator.Coche;
import com.mediator.SistemaMediator;
import com.mediator.Mediator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSistema {
    private Radio radio;
    private Telefono telefono;
    private Coche coche;
    private Mediator mediator;

    @Before
    public void init() {
        mediator = new SistemaMediator();

        radio = new Radio();
        telefono = new Telefono();
        coche = new Coche();

        radio.setMediator(mediator);
        telefono.setMediator(mediator);
        coche.setMediator(mediator);

        ((SistemaMediator) mediator).setRadio(radio);
        ((SistemaMediator) mediator).setTelefono(telefono);
        ((SistemaMediator) mediator).setCoche(coche);
    }

    @Test
    public void test_encender_apagar_coche() {
        assertFalse(radio.encendida());
        assertFalse(telefono.musicaEncendida());

        telefono.enciendeMusica();
        assertTrue(telefono.musicaEncendida());

        coche.enciende();

        assertTrue(radio.encendida());
        assertFalse(telefono.musicaEncendida());

        coche.apaga();
        assertFalse(radio.encendida());
    }

    @Test
    public void test_suena_telefono() {
        radio.enciende();
        assertTrue(radio.encendida());

        telefono.recibeLlamada();

        assertFalse(radio.encendida());
    }

    @Test
    public void test_enciende_radio() {
        telefono.enciendeMusica();
        assertTrue(telefono.musicaEncendida());

        radio.enciende();

        assertFalse(telefono.musicaEncendida());
    }
}
