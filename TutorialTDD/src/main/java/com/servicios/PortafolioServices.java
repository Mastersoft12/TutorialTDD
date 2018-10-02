package com.servicios;

import java.util.List;

import com.dto.Valor;

public class PortafolioServices {

	private StockService stockService;

	private List<Valor> valores;

	public double obtenerPrecioMercado() {
		double marketValue = 0.0;

		for (Valor valor : valores) {
			marketValue += stockService.getPrice(valor) * valor.getCantidad();
		}
		return marketValue;
	}

	public StockService getStockService() {
		return stockService;
	}

	public void setStockService(StockService stockService) {
		this.stockService = stockService;
	}

	public List<Valor> getValores() {
		return valores;
	}

	public void setValores(List<Valor> valores) {
		this.valores = valores;
	}

}
