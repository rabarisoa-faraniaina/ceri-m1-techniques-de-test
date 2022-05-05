package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.mockito.Mockito;

public class IPokemonFactoryTest {
	
	@Test
	public void testcreatePok() {
		IPokemonFactory ip = mock(IPokemonFactory.class);
		Pokemon pok = new Pokemon(0,"Bulbizarre",126,126,90,613,64,4000,4,56);
		Mockito.when(ip.createPokemon(0,613, 64, 4000, 4))
				.thenReturn(pok);
		
		
		assertEquals(613,pok.getCp());
		assertEquals(64,pok.getHp());
		assertEquals(4000,pok.getDust());
		assertEquals(4,pok.getCandy());
		assertSame(56,pok.getIv());
	}
}
