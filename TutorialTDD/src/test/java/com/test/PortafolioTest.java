package com.test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import com.dto.Valor;
import com.servicios.PortafolioServices;
import com.servicios.StockService;

public class PortafolioTest {

	private PortafolioServices portafolioServices;

	private StockService stockService;

	@Before
	public void iniciarParametros() {
		this.portafolioServices = new PortafolioServices();
		this.stockService = mock(StockService.class);
		this.portafolioServices.setStockService(stockService);
	}

	@Test
	public void validarPrecioMercado() {
		List<Valor> valores = new ArrayList<>();
		Valor googleValor = new Valor(1, "google", 2);
		Valor microsoftValor = new Valor(1, "microsoft", 1);
		valores.add(googleValor);
		valores.add(microsoftValor);
		this.portafolioServices.setValores(valores);
		when(stockService.getPrice(googleValor)).thenReturn(50.0);
		when(stockService.getPrice(microsoftValor)).thenReturn(60.0);
		assertEquals(160.0, portafolioServices.obtenerPrecioMercado(),0);
	}

	public PortafolioServices getPortafolioServices() {
		return portafolioServices;
	}

	public void setPortafolioServices(PortafolioServices portafolioServices) {
		this.portafolioServices = portafolioServices;
	}

	public StockService getStockService() {
		return stockService;
	}

	public void setStockService(StockService stockService) {
		this.stockService = stockService;
	}

}
