const pokeAPI = {
  getPokemonDetail(pokemon) {
    return fetch(pokemon.url).then((response) => response.json());
  },

  getPokemons(offset = 0, limit = 10) {
    const URL = `https://pokeapi.co/api/v2/pokemon?offset=${offset}&limit=${limit}`;
    return fetch(URL)
      .then((response) => response.json())
      .then((jsonBody) => jsonBody.results)
      .then((pokemons) => pokemons.map(pokeAPI.getPokemonDetail))
      .then((detailRequests) => Promise.all(detailRequests))
      .then((pokemonsDetails) => pokemonsDetails);
  },
};
