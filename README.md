# CodeChallengeGH

CodeChallengeGH is a repository that uses java as programming language and Selenium Webdriver as Framework, following a POM design. It's meant to fulfill the instructions given by GlobalHitts, which are the following:

Exercise:   

	Enter the website  

	Select México as a country  

	Search for the term “playstation 5”  

	Filter by condition “Nuevos”  

	Filter by location “Cdmx”  

	Order by “mayor a “menor precio”  

	Obtain the name and the price of the first 5 products   

	Print these products in the console  

## Installation

In order to use the framework:

Fork the repository.
Clone, i.e, download your copy of the repository to your local machine using
git clone https://github.com/AlbertoPerezMartin/CodeChallengeGH.git
Import the project in IntelliJ IDEA.
Make your desired configuration changes.
Use IntelliJ IDEA's Junit to run your desired tests. 


## Usage
Run the LanguageTests.java file using Junit to see the program perform.

# Notes
Some fields were different as expected so the test was adjusted accordingly, specifically on the location "Cdmx" filter wasn't available so I used "Distrito Federal" filter as the closest replacement and the "mayor a menor precio" wasn't available so I used the "Mayor precio" order by.
The program can print on the console the first 5 products and its respective prices, however, for some reason the price fails on the 4th iteration and throws and exception not finding the element, which is weird because I typed in manually al XPaths and I don't know why it's failing, I would appreciate a lot some feedback regarding this, thanks. 
Due to the issue with the price printing, that line is commented with its respective comment to make the program run successfully, but I invite you to uncomment that line (MexicoListadoPage, row 53) to see its behaviour once reviewing. If so, uncomment line 54 on the same file and comment line 56 on the same file as well.
To make the test more visual and lasting I commented as well the driver.quit on the BaseTest.java file on the row 38, but you can uncomment it if required, I just thought it would be useful to you having the browser open for the duration until the end.
