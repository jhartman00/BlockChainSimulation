
# Blockchain Simulator

I created this program to learn more about cryptocurrency and blockchain technology.  I learned a lot making this program and I hope you can get something out of it as well!



## Authors

- [@jamiehartman00](https://www.github.com/jamiehartman00)



## Demo

https://youtu.be/M_qdeU8dpS0


## Running the Program

1. To try this project for yourself make sure you have Java installed on your computer.  If you don't you can go to https://www.java.com/en/download/ to get it for free!
    - Windows: https://www.youtube.com/watch?v=IJ-PJbvJBGs
    - Mac: https://www.youtube.com/watch?v=pxi3iIy4F5A
2. Clone the directory or download the zip file to a location of your choosing.  
3. Open a terminal/command shell in the src/main/java/blockchain folder
4. Run the command to compile the program "javac main.java"
5. To run the program run the command "java main"

## Once the program is running

1. The program will prompt you to choose a starting zero amount.  This determines how many zero's the first block's hash will contain. Enter an integer.
2. After entering the zero amount the program will prompt you to choose how many blocks it will create. Enter an integer.
3. Finally, the program will ask you if you want chat to be on or off. If you want chat, enter 1.  If you do not want chat, enter 2.

## A few things to note

1. Mining a block in a blockchain can take a while, especially if you choose a high starting zero amount.  I have found that a zero amount of 6 generates within a minute and 7 can take anywhere from a minute to 10 minutes.  
2. After the first block the program will automatically adjust the zero amount of the next block.  If the block takes longer than 60 seconds to generate the zero amount will decrease by one.  If the block takes less than 10 seconds to generate the zero amount will increase.  If the block takes between 10 and 60 seconds to generate the zero amount will not change.
3. The chat function is currently in beta.  It works semi well but will clog up the screen if the block takes a while to generate as there can be hundreds of messages.
4. The "miners" are different threads on your machine.  Becuase of this any thread can mine a block and after one is mined they will all move to mining the next block.


## FAQ

#### Questions?

Feel free to email me at jamiehartman00@gmail.com or jhartman1@tulane.edu and I will get back to you as soon as possible.




## Lessons Learned

I learned a lot creating this project.  To start, I learned a lot about blockchain technology, how hashing works, and how each block is connected and verified.  I also learned how to multithread a java program.  These are all valuble lessons that I will use in many projects going forward.

## Want more?

Check out my website at https://jamiehartman-com.stackstaging.com/

<h3 align="left">Connect with me:</h3>
<p align="left">
<a href="https://linkedin.com/in/jamiehartman00" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/linked-in-alt.svg" alt="jamiehartman00" height="30" width="40" /></a>
<a href="https://instagram.com/jamie_hartman99" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/instagram.svg" alt="jamie_hartman99" height="30" width="40" /></a>
<a href="https://github.com/jhartman00" target="blank"><img align="center" src="https://raw.githubusercontent.com/rahuldkjain/github-profile-readme-generator/master/src/images/icons/Social/github.svg" alt="jamiehartman00" height="30" width="40" /></a>
</p>

<h3 align="left">Languages and Tools:</h3>
<p align="left"> <a href="https://getbootstrap.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/bootstrap/bootstrap-plain-wordmark.svg" alt="bootstrap" width="40" height="40"/> </a> <a href="https://www.cprogramming.com/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/c/c-original.svg" alt="c" width="40" height="40"/> </a> <a href="https://www.w3schools.com/cpp/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/cplusplus/cplusplus-original.svg" alt="cplusplus" width="40" height="40"/> </a> <a href="https://www.w3schools.com/css/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/css3/css3-original-wordmark.svg" alt="css3" width="40" height="40"/> </a> <a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> </a> <a href="https://www.w3.org/html/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/html5/html5-original-wordmark.svg" alt="html5" width="40" height="40"/> </a> <a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="40" height="40"/> </a> <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/javascript/javascript-original.svg" alt="javascript" width="40" height="40"/> </a> <a href="https://www.mathworks.com/" target="_blank" rel="noreferrer"> <img src="https://upload.wikimedia.org/wikipedia/commons/2/21/Matlab_Logo.png" alt="matlab" width="40" height="40"/> </a> <a href="https://www.mysql.com/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/mysql/mysql-original-wordmark.svg" alt="mysql" width="40" height="40"/> </a> <a href="https://nodejs.org" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/nodejs/nodejs-original-wordmark.svg" alt="nodejs" width="40" height="40"/> </a> <a href="https://pandas.pydata.org/" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/2ae2a900d2f041da66e950e4d48052658d850630/icons/pandas/pandas-original.svg" alt="pandas" width="40" height="40"/> </a> <a href="https://www.php.net" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/php/php-original.svg" alt="php" width="40" height="40"/> </a> <a href="https://www.postgresql.org" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/postgresql/postgresql-original-wordmark.svg" alt="postgresql" width="40" height="40"/> </a> <a href="https://www.python.org" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/python/python-original.svg" alt="python" width="40" height="40"/> </a> <a href="https://pytorch.org/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/pytorch/pytorch-icon.svg" alt="pytorch" width="40" height="40"/> </a> <a href="https://scikit-learn.org/" target="_blank" rel="noreferrer"> <img src="https://upload.wikimedia.org/wikipedia/commons/0/05/Scikit_learn_logo_small.svg" alt="scikit_learn" width="40" height="40"/> </a> <a href="https://seaborn.pydata.org/" target="_blank" rel="noreferrer"> <img src="https://seaborn.pydata.org/_images/logo-mark-lightbg.svg" alt="seaborn" width="40" height="40"/> </a> <a href="https://www.sqlite.org/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/sqlite/sqlite-icon.svg" alt="sqlite" width="40" height="40"/> </a> <a href="https://svelte.dev" target="_blank" rel="noreferrer"> <img src="https://upload.wikimedia.org/wikipedia/commons/1/1b/Svelte_Logo.svg" alt="svelte" width="40" height="40"/> </a> <a href="https://www.tensorflow.org" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/tensorflow/tensorflow-icon.svg" alt="tensorflow" width="40" height="40"/> </a> </p>


<h3 align="left">Support:</h3>
<p><a href="https://www.buymeacoffee.com/jamiehartman"> <img align="left" src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" height="50" width="210" alt="jamiehartman" /></a></p><br><br>
