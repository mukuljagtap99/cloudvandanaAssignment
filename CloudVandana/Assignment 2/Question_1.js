// Take input from the user
const inputSentence = prompt("Enter a sentence:");

// Check if the user provided a sentence
if (inputSentence !== null && inputSentence !== "") {
    // Call the function to reverse the words
    const reversed = reverseWordsInSentence(inputSentence);
    alert("Reversed Sentence: " + reversed);
} else {
    alert("You didn't provide a sentence.");
}

function reverseWordsInSentence(sentence) {
    // Split the sentence into words
    const words = sentence.split(' ');

    // Reverse each word and store them in a new array
    const reversedWords = words.map(word => reverseWord(word));

    // Join the reversed words back into a sentence
    const reversedSentence = reversedWords.join(' ');

    return reversedSentence;
}

function reverseWord(word) {
    // Convert the word to an array of characters, reverse it, and join it back
    return word.split('').reverse().join('');
}
