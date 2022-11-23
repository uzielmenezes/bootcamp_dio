const pokemonList = document.getElementById("pokemonList");
const loadMore = document.getElementById("loadMore");
const maxRecords = 151;
const limit = 8;
let offset = 0;

function loadPokemonItems(offset, limit) {
  pokeAPI.getPokemons(offset, limit).then((pokemons = []) => {
    const newHTML = pokemons
      .map(
        (pokemon) => `
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
        <div class="moreDetails">
            <h1>Details</h1>      
            <span class="species">Height: ${pokemon.height}</span>
            <span class="species">Stats: ${pokemon.stats}</span>
            <span class="species">Effort: ${pokemon.effort}</span>
        </div>
     </li>
 `
      )
      .join("");
    pokemonList.innerHTML += newHTML;
  });
}

loadPokemonItems(offset, limit);

loadMore.addEventListener("click", () => {
  offset += limit;

  const recordsNextPage = offset + limit;

  if (recordsNextPage >= maxRecords) {
    const newLimit = maxRecords - offset;
    loadPokemonItems(offset, newLimit);
    loadMore.parentElement.removeChild(loadMore);
  } else {
    loadPokemonItems(offset, limit);
  }
});
