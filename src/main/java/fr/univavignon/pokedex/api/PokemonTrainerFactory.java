package fr.univavignon.pokedex.api;

public class PokemonTrainerFactory implements IPokemonTrainerFactory{

	@Override
	public PokemonTrainer createTrainer(String name, Team team, IPokedexFactory pokedexFactory) {
		PokemonMetadataProvider pmdp = new PokemonMetadataProvider();
		
		pokedexFactory.createPokedex(null, null);
		return null; //pokemontrainer
	}

}
