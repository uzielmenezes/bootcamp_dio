const offset = 0;
const limit = 10;
const URL = `https://pokeapi.co/api/v2/pokemon?offset=${offset}&limit=${limit}`;

function converPokemonToHTML(pokemon) {
  return `
        <li class="pokemon-i">
            <span class="number">#001</span>
            <span class="name">${pokemon.name}</span>

            <div class="details">
                <ol class="types">
                    <li class="type">grass</li>
                    <li class="type">poison</li>
                 </ol>
                <img
                  src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/1.svg"
                  alt="${pokemon.name}"
                />
            </div>
         </li>
     `;
}

const pokemonList = document.getElementById("pokemonList");

fetch(URL)
  .then((response) => response.json())
  .then((jsonBody) => jsonBody.results)
  .then((pokemons) => {
    for (let i = 0; i < pokemons.length; i++) {
      const pokemon = pokemons[i];
      pokemonList.innerHTML += converPokemonToHTML(pokemon);
    }
  })
  .catch((err) => console.log(err));
