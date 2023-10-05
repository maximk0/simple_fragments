# simple_fragments
This repository for training fragment

This application has 4 fragments:
 - Fragment A transitions to Fragment B.
 - Fragment B transitions to Fragment C, passing along some text. Fragment B can also return to Fragment A.
 - Fragment C displays the text from Fragment B. It can also go back or transition to Fragment D.
 - Fragment D transitions to Fragment A (the chain of fragments in the backstack is deleted).

## Built With
1. Kotlin
2. XML
3. Fragment manager

## Preview
[simple_fragments_video_preview.webm](https://github.com/maximk0/simple_fragments/assets/98814130/d904f4be-5d5a-47d1-8ecb-6cb51fd89fe2)
<img src="preview/fragment_a.png"  width="350"> <img src="preview/fragment_b.png"  width="350"> 
<img src="preview/fragment_c.png"  width="350"> <img src="preview/fragment_d.png"  width="350">
