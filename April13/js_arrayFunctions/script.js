animals = new Array("Dog", "Cat");
animals.push("Fox", "Fish");
document.write(animals);

document.write("</br>");

var fish = animals.pop();
document.write(fish);
document.write("</br>");
document.write(animals);

document.write("</br>");
animals.unshift("Bird", "Eagle");
document.write(animals);

document.write("</br>");
var bird = animals.shift();
document.write(bird);
document.write("</br>");
document.write(animals);

document.write("</br>");
animals.sort();
document.write(animals);

document.write("</br>");
animals.reverse();
document.write(animals);

var all_four = animals.join(", ");
document.write("</br>");
document.write(all_four);

animals.splice(1,2);
var all_two = animals.join(", ");
document.write("</br>");
document.write(all_two);

