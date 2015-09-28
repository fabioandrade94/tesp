package br.unibh.pessoas;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.unibh.pessoas.entidades.PessoaFisica;
import br.unibh.pessoas.persistencia.PessoaFisicaDAO;

import br.unibh.pessoas.entidades.PessoaJuridica;
import br.unibh.pessoas.persistencia.PessoaJuridicaDAO;

public class Testes {

	@Test
	public void testePessoaFisicaFindAll() {

		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		List<PessoaFisica> l = dao.findAll();
		Assert.assertEquals(l.size(), 100);

	}

	@Test
	public void testePessoaFisicaFind() {
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		PessoaFisica p = dao.find(6L);
		Assert.assertEquals(p.getNome(), "Michael B. Ferguson");
	}

	@Test
	public void testePessoaFisicaInserir() {
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		PessoaFisica pf = new PessoaFisica(null, "Fulano", "Rua Ciclalandia", "31-3288-3030", "98734567854",
				"ciclanofulano@fas.com", new Date(), "M");
		dao.insert(pf);
		PessoaFisica pf2 = dao.find("Fulano");
		Assert.assertNotNull(pf2);
		dao.delete(pf2);
		PessoaFisica pf3 = dao.find("Fulano");
		Assert.assertNull(pf3);

	}

	@Test
	public void testePessoaFisicaAtualizar() {
		PessoaFisicaDAO dao = new PessoaFisicaDAO();
		PessoaFisica pf = new PessoaFisica(null, "Ciclano da Silva", "Rua Ciclalandia", "31-3288-2345", "86754246798",
				"ciclanofula@das.com", new Date(), "M");
		dao.insert(pf);
		PessoaFisica pf2 = dao.find("Ciclano da Silva");
		pf2.setNome("Beltrano da Silva");
		dao.update(pf2);
		PessoaFisica pf3 = dao.find("Beltrano da Silva");
		Assert.assertNotNull(pf3);
		dao.delete(pf3);
	}

	@Test
	public void testePessoaJuridicaFindAll() {

		PessoaJuridicaDAO dao = new PessoaJuridicaDAO();
		List<PessoaJuridica> l = dao.findAll();
		Assert.assertEquals(l.size(), 100);

	}

	@Test
	public void testePessoaJuridicaFind() {
		PessoaJuridicaDAO dao = new PessoaJuridicaDAO();
		PessoaJuridica p = dao.find(6L);
		Assert.assertEquals(p.getNome(), "Hilda M. Hahn");
	}

	@Test
	public void testePessoaJuridicaInserir() {
		PessoaJuridicaDAO dao = new PessoaJuridicaDAO();
		PessoaJuridica pj = new PessoaJuridica(null, "Fulano", "Rua Ciclalandia", "31-3288-3030", "98734567854",
				new Date(), "M");
		dao.insert(pj);
		PessoaJuridica pj2 = dao.find("Fulano");
		Assert.assertNotNull(pj2);
		dao.delete(pj2);
		PessoaJuridica pj3 = dao.find("Fulano");
		Assert.assertNull(pj3);

	}

	@Test
	public void testePessoaJuridicaAtualizar() {
		PessoaJuridicaDAO dao = new PessoaJuridicaDAO();
		PessoaJuridica pj = new PessoaJuridica(null, "Ciclano da Silva", "Rua Ciclalandia", "31-3288-2345",
				"86754246798", new Date(), "M");
		dao.insert(pj);
		PessoaJuridica pj2 = dao.find("Ciclano da Silva");
		pj2.setNome("Beltrano da Silva");
		dao.update(pj2);
		PessoaJuridica pj3 = dao.find("Beltrano da Silva");
		Assert.assertNotNull(pj3);
		dao.delete(pj3);
	}

}
