# CS 203 Fall 2023 Lab 11

### Hello all!

#### Welcome to the final lab assignment of the semester.

####    This lab will incorporate file IO, encryption, decryption, and using GitHub!

Included in `src` is two files `encrypted.txt` && `encryptMe.txt` the goal 
is to decrypt the former and encrypt the latter text file 
and push your code/files  to canvas. 

The file is encrypted with a **caesar cipher**, please Google what 
this is if you do not understand how it is working.
`encrypted.txt` **is shifted >1 && <10 times. Encrypt** `encryptMe.txt`
**With the same amount of shift**

There is already a scaffold to help you start coding, but please feel free
to add any helper functions you would like!

## Here are some steps to get you started
### Prerequisites
1. A GitHub account, make one [here](https://github.com)
2. Git installed on your machine, install it [here](https://git-scm.com/downloads)
You can test to see if you have git on your machine by opening a new terminal/cmd instance and typing 
```bash
git
```
If you have git, you should get a help menu

## Fork this repository
<img align="right" width="300" src="https://firstcontributions.github.io/assets/Readme/fork.png" alt="fork this repository" />
Fork this repository by clicking on the fork button on the top of this page.
This will create a copy of this repository under your account.
<br>
<br>
<br>

## Clone the repository

<img align="right" width="300" src="https://firstcontributions.github.io/assets/Readme/clone.png" alt="clone this repository" />

Now clone the forked repository to your machine. Go to your GitHub account, open the forked repository, click on the code button and then click the _copy to clipboard_ icon.

Open a terminal and run the following git command:

```bash
git clone <the url you copied>
```

where "url you just copied" (without the quotation marks) is the url to this repository (your fork of this project). See the previous steps to obtain the url.

<img align="right" width="300" src="https://firstcontributions.github.io/assets/Readme/copy-to-clipboard.png" alt="copy URL to clipboard" />

<br><br><br><br><br><br><br><br>
# Next

- Read `encrypted.txt`
- Decrypt the file
- Write to a new file, _it must be named_ `decrypted.txt`


- Read `encryptMe.txt`
- Encrypt it with the same amount of shift as `encrypted.txt`
- Write to a new file, _it must be named_ `newEncrypted.txt`


- Commit and push the code to your repository
- Upload a link to your repository to canvas!

### Good luck!

## Tips:
- You made want to comment out the method calls to encrypt and decrypt as you fill out those functions
- Decrypting is the same an encrypting, but backwards
- You will need to do some type casting
- Ceaser's cipher should only apply to letters, uppercase and lowercase. Not special characters or spaces

# References

[UAB ACM](https://github.com/UABACM/first-contribution-uab)
