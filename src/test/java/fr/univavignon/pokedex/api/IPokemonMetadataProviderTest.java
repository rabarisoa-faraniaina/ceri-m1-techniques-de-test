package fr.univavignon.pokedex.api;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;

import org.junit.Test;
import org.mockito.Mockito;

public class IPokemonMetadataProviderTest {

	@Test
	public  void testingReturnValue() throws PokedexException{
		IPokemonMetadataProvider ipokemondata = mock(IPokemonMetadataProvider.class);
		Mockito.when(ipokemondata.getPokemonMetadata(0))
			.thenReturn(new PokemonMetadata(0,"Aquali",126,126,90));
		
		assertEquals(0,ipokemondata.getPokemonMetadata(0).getIndex());

	}
	
	/** Test PokedexException */
	@Test(expected=PokedexException.class)
	public void testException() throws PokedexException {
		IPokemonMetadataProvider ipokemondata = mock(IPokemonMetadataProvider.class);
		Mockito.when(ipokemondata.getPokemonMetadata(anyInt())).thenThrow(
				new PokedexException("Show Pokedex Exception"));
		/** call method to try exception */
		ipokemondata.getPokemonMetadata(anyInt());
	}
	
	//qu est ce que je veux renvoyer
	//c'est ca que je veux que ca marche
	// etre independant le plus possible
}
