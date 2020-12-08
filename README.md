# [My Personal Website](https://kalaiz.github.io/)
![Status](https://img.shields.io/badge/status-viewable-green)

## Table of Content:
- [Description](#-description)
- [Tools Used](#%EF%B8%8F-tools-used)
- [Reflection](#%EF%B8%8F-reflection)
- [References](#-references)

### 📜 Description:
A simple personal website built using Kotlin. The challenge is to write majority of HTML, CSS and JS code in Kotlin.

<p align="center">
<img src="/resources/website_overview.gif"  /> 
</p>

### 🛠️ Tools Used:
- Kotlin React,CSS and Styled [Wrapper](https://github.com/JetBrains/kotlin-wrappers)
- Kotlin: Delegate Properties, lambda functions,Standard Higher order functions, Class References
- Chrome: For Viewing and Debugging
- [Hex Color Tool](https://codepen.io/sosuke/pen/Pjoqqp): Convert Image color to a certain color 


### ✍️ Reflection:
- I have leveraged on the Wrappers to build this project. I tried to go Kotlin 100%, however,as far as I have searched HTML tags such as meta [does not](https://github.com/JetBrains/kotlin-wrappers/blob/4c757b59f94e92146e9686f6a0444fe28c1b1a93/kotlin-react-dom/src/main/kotlin/react/dom/ReactDOMTags.kt#L171) have all attributes; Example: [`charset`](https://www.w3schools.com/tags/att_meta_charset.asp). 

- As I started off, I was unable to understand [kotlin.style API](https://github.com/JetBrains/kotlin-wrappers/tree/master/kotlin-styled) which uses the same idea as CSS in JS. Furthermore, the lack of documentation made it slightly tougher. Eventually I had to skim through what CSS in JS means. Also, at times, I found myself referring to the underlying implementation (Wrapper API code) so to help me understand what I should be doing. 

- I learned and used CSS [Flexible Box Layout](https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Flexible_Box_Layout/Basic_Concepts_of_Flexbox) (flexbox) as they have powerful alignment capabilities.

- Deployment: Github Pages looks for the compiled resources in either in the `root` directory or in `docs`. The default generated output is located in `/build/distribution` and I had to either manually copy the compiled resources to the `docs` folder or had to make some script which does that. This is when I thought I could create a Gradle `Task` for it. The gradle file (generated by the IDE) was Kotlin based, which was convenient for me as I could make use of Kotlin stdlib to help me.

- Not all CSS attributes were supported, and I overcame this by using [`put()`](https://github.com/JetBrains/kotlin-wrappers/tree/master/kotlin-styled#css-properties)

- Debugging seemed different in comparison to debugging a standard program  on an IDE, as I had to [debug](https://kotlinlang.org/docs/tutorials/javascript/debugging-kotlin-in-browser.html) the website on a Web Interface.

- I have not leveraged much on React and have done majority of the implementation based on HTML and CSS (in Kotlin). This is due to the website not having complex functionalities such as handling states of components.



### 🔖 References:
- Adapted CSS [Theme](https://codepen.io/d3vsh4/pen/LMYLYp) and converted into Kotlin.
- [Hex Color Tool](https://codepen.io/sosuke/pen/Pjoqqp): Produces filter attrbute values which convert a black color to a certain color. 




