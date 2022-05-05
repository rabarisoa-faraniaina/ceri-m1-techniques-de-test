package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.mockito.Mockito;

public class IPokemonTrainerFactoryTest {
	
	@Test
	public void testcreateTrainerMethod() {
		IPokemonTrainerFactory ip = mock(IPokemonTrainerFactory.class);
		IPokedexFactory ipF = mock(IPokedexFactory.class);
		IPokedex ipD = mock(IPokedex.class);
		PokemonTrainer pktr = new PokemonTrainer("name",Team.INSTINCT,ipD);
		Mockito.when(ip.createTrainer("name", Team.INSTINCT, ipF))
			.thenReturn(pktr);
		
		//check the name value
		assertEquals("name",pktr.getName());
		
		//check the team value
		assertSame("INSTINCT",pktr.getTeam().toString());
		
		//check pokedex
		assertSame(ipD,pktr.getPokedex());
	}
	
}
