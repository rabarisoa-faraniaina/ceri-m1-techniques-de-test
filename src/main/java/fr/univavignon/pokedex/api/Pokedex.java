package fr.univavignon.pokedex.api;

import java.util.Comparator;
import java.util.List;

public class Pokedex implements IPokedex{
	
	/** get pokemon metadata */
	@Override
	public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
		
		PokemonMetadataProvider pk = new PokemonMetadataProvider();
		return pk.getPokemonMetadata(index);
	}
	
	/** create pokemon */
	@Override
	public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) {
		PokemonMetadataProvider pk = new PokemonMetadataProvider();
		PokemonMetadata pm;
		try {
			pm = pk.getPokemonMetadata(index);
			Pokemon p = new Pokemon(index,pm.getName(),pm.getAttack(),pm.getDefense(),pm.getStamina(),cp,hp,dust,candy,0);
			return p;
		} catch (PokedexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	/** Number of pokemon in this pokedex */
	@Override
	public int size() {
		
		return this.getPokemons().size();
	}
	
	/** add a pokemon */
	@Override
	public int addPokemon(Pokemon pokemon) {
		if(this.getPokemons().add(pokemon)) {
			return 1;
		}
		
		return 0;
	}
	
	/** get pokemon from id*/
	@Override
	public Pokemon getPokemon(int id) throws PokedexException {
		List<Pokemon> listPok = this.getPokemons();
		for(int i = 0; i < this.size(); i++) {
			if(listPok.get(i).getIndex() == id) {
				return listPok.get(i);
			}
		}
		return null;
	}

	@Override
	public List<Pokemon> getPokemons() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pokemon> getPokemons(Comparator<Pokemon> order) {
		// TODO Auto-generated method stub
		return null;
	}

}
