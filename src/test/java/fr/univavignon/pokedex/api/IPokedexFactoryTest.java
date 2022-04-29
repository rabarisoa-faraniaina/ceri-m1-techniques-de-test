package fr.univavignon.pokedex.api;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;

public class IPokedexFactoryTest {
	
	@Test
	public void testFunction() {
		IPokedexFactory ip = mock(IPokedexFactory.class);
		Mockito.when(ip.createPokedex(any(IPokemonMetadataProvider.class),any(IPokemonFactory.class)))
		.thenReturn(any(IPokedex.class));
	
		//assertEquals(0,ipokemondata.getPokemonMetadata(0).getIndex());
	}
}
