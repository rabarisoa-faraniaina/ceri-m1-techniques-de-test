package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;
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
		//PokemonTrainer ptr = new PokemonTrainer("name",Team.INSTINCT,any(IPokedex.class));
		Mockito.when(ip.createTrainer(eq("name"), eq(Team.INSTINCT), any(IPokedexFactory.class)))
			.thenReturn(new PokemonTrainer(("name"),eq(Team.INSTINCT),any(IPokedex.class)));
		
		//check the name value
		assertEquals("name",ip.createTrainer(eq("name"), eq(Team.INSTINCT), any(IPokedexFactory.class)).getName());
		
		//check the team value
		assertEquals("INSTICT",ip.createTrainer(eq("name"), eq(Team.INSTINCT), any(IPokedexFactory.class)).getTeam());
	}
	
}
