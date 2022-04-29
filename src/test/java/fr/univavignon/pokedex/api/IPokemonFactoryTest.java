package fr.univavignon.pokedex.api;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.mockito.Mockito;

public class IPokemonFactoryTest {
	
	@Test
	public void testcreatePok() {
		IPokemonFactory ip = mock(IPokemonFactory.class);
		Mockito.when(ip.createPokemon(0,613, 64, 4000, 4))
				.thenReturn(new Pokemon(0,"Bulbizarre",126,126,90,613,64,4000,4,56));
		
		
		//verify();
	}
}
