function converPokemonTypesToHTML(pokemonTypes) {
  return pokemonTypes.map(
    (typeSlot) => `<li class="type">${typeSlot.type.name}</li>`
  );
}

function converPokemonToHTML(pokemon) {
  return `
        <li class="pokemon-i">
            <span class="number">#${pokemon.order}</span>
            <span class="name">${pokemon.name}</span>

            <div class="details">
                <ol class="types">
                    ${converPokemonTypesToHTML(pokemon.types).join("")}
                 </ol>
                <img
                  src="${pokemon.sprites.other.dream_world.front_default}"
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
