package fr.univavignon.pokedex.api;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class IPokedexTest {
	
	/** test addPokemon returned value */
	@Test
	public void testaddPokemonReturnValue () {
		IPokedex ip = mock(IPokedex.class);
		Mockito.when(ip.addPokemon(new Pokemon(0,"Bulbizarre",126,126,90,613,64,4000,4,56)))
				.thenReturn(0);
		
		/** check returned value if it's the set index*/
		assertEquals(0,ip.addPokemon(new Pokemon(0,"Bulbizarre",126,126,90,613,64,4000,4,56)));
	}
	
	/** test getPokemon returned value */
	@Test
	public void testgetPokemon() throws PokedexException {
		IPokedex ip = mock(IPokedex.class);
		Mockito.when(ip.getPokemon(0))
				.thenReturn(new Pokemon(0,"Bulbizarre",126,126,90,613,64,4000,4,56));
		
		/** check returned value if it's the set index*/
		assertEquals(0,ip.getPokemon(0).getIndex());
	}
	
	/** test pokedex exception in getPokemon method */
	@Test(expected=PokedexException.class)
	public void testPokedexExcep() throws PokedexException {
		IPokedex ip = mock(IPokedex.class);
		Mockito.when(ip.getPokemon(anyInt())).thenThrow(
				new PokedexException("Show Pokedex Exception"));
		
		/** call method to try exception */
		ip.getPokemon(anyInt());
	}
	
	/** size of list */
	@Test
	public void testSize() {
		IPokedex ip = mock(IPokedex.class);
		Mockito.when(ip.size())
				.thenReturn(5);
		
		assertEquals(5,ip.size());
		
	}
	
	/** test getPokemons */
	@Test
	public void testgetPokemons() {
		IPokedex ip = mock(IPokedex.class);
		List<Pokemon> list = new ArrayList<Pokemon>(); 
		list.add(new Pokemon(0,"Bulbizarre",126,126,90,613,64,4000,4,56));
		list.add(new Pokemon(133,"Aquali",186,168,260,2729,202,5000,4,100));
		Mockito.when(ip.getPokemons())
				.thenReturn(list);
		
		assertEquals(2,ip.getPokemons().size());
		assertEquals(0,ip.getPokemons().get(0).getIndex());  //check 
	}
	/** test getPokemons list  method */
	@Test
	public void testgetPokemonsComp() {
		/**IPokedex ip = mock(IPokedex.class);
		List<Pokemon> list = new ArrayList<Pokemon>();
		Mockito.when(ip.getPokemons(new Comparator<Pokemon>)))
				.thenReturn(list);*/
	}
}
