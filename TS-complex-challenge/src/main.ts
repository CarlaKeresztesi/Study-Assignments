import { companies } from './data';

const renderBtn = document.querySelector<HTMLButtonElement>('#renderCompanies');//declaring our vars//
const container = document.querySelector<HTMLDivElement>('#companiesContainer');

console.log(renderBtn);

if (!renderBtn || !container) {
    throw new Error('One of the elements is not defined');
};

//loop through the array
//render data for each of the companies(each of the keys should give us one value string or number)

const handleRender = () => {
    //for each obj inside the array, render a card that contains all the infor from the data.
    
    container.innerHTML = " "; //empty div to store - every time you click the button, go fetch the data again – as an API call to fetch the latest updated data and then display it on the page./

    companies.forEach(({ name, industry, start, end }) => { //executes the function for each el of the companies' array /
        const card = document.createElement('div');   //need the card below as forEach doesn't return anything/
      // creates a card div with each element containing the below, ``to access the data inside the array:/   
        card.innerHTML = `<div>
        <h2>${name}</h2>
        <p>${industry}</p>
        <p>${start}</p>
        <p>${end}</p>
        </div>`;

        container.appendChild(card);//adds a node /
     }); // to the end of list of children of a spec parent node/
}

renderBtn.addEventListener('click', handleRender); //sets up a fction that will be called/
                             // whenever the specified event is delivered to the target/
console.log('Hello after');









