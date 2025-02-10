import './style.css'

// Write a function titleCase that converts a sentence to title case (the first letter of each word capitalised).



  const sentence: string = "i am dev"; //declaring the sentence variable

  const word = sentence.split(" "); //splitting sentence string into array of words

       //declaring function
   function titleCase(sentence: string) {

       //map the words into another array, where 
        const words = sentence.split(" ").map(word =>

       // the first letter will be upperCase and the rest of letters, after index 1, will be lowerCase 
         word.charAt(0).toUpperCase() + word.slice(1).toLowerCase())  

       //reconstructs the sentence  
        .join(" ");    

        //return the final string
      return words;

}
    //show output
console.log(titleCase(sentence));





