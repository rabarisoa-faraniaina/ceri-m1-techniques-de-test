package fr.univavignon.pokedex.api;

public class PokemonTrainerFactory implements IPokemonTrainerFactory{

	@Override
	public PokemonTrainer createTrainer(String name, Team team, IPokedexFactory pokedexFactory) {
	
		PokemonTrainer p = new PokemonTrainer(name,team,pokedexFactory.createPokedex(null, null);
		return p;
	}

}
