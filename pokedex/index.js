function converPokemonToHTML(pokemon) {
  return `
        <li class="pokemon-i ${pokemon.type}">
            <span class="number">#${pokemon.number}</span>
            <span class="name">${pokemon.name}</span>

            <div class="details">
                <ol class="types">
                    ${pokemon.types
                      .map((type) => `<li class="type ${type}">${type}</li>`)
                      .join("")}
                 </ol>
                <img
                  src="${pokemon.photo}"
                  alt="${pokemon.name}"
                />
            </div>
         </li>
     `;
}

const pokemonList = document.getElementById("pokemonList");

pokeAPI.getPokemons().then((pokemons = []) => {
  pokemonList.innerHTML += pokemons.map(converPokemonToHTML).join("");
});
