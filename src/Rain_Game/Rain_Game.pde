int raindropX =(int)random(20, 750);
int raindropY =400;

int raindropX2 =(int)random(20, 750);
int raindropY2 =200;

int raindropX3 =(int)random(20, 750);
int raindropY3 =600;

int score=0;

void checkCatch(int x){
     if (x < mouseX+100 && x > mouseX-100)
          score++;
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }


void setup() {
  size(800, 800);
  
}



void draw(){
  background(200, 200, 240);
  
  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
  
  stroke(0, 0, 0);
  fill(140, 140, 140);
  quad(mouseX-80, 800, mouseX+80, 800, mouseX+90, 600, mouseX-90, 600);
   
  fill(8, 8, 130);
  stroke(5, 5, 80);
   
   //first raindrop
  ellipse(raindropX, raindropY, 30, 30);
   
  raindropY = raindropY+5;
   
  if(raindropY>820) {
    raindropX =(int)random(20, 750);
    raindropY = 0;
    }
    
   if(raindropY == 600){
       checkCatch(raindropX);
   }
  //second raindrop
    ellipse(raindropX2, raindropY2, 30, 30);
   
  raindropY2 = raindropY2+5;
   
  if(raindropY2>820) {
    raindropX2 =(int)random(20, 750);
    raindropY2 = 0;
    }
    
   if(raindropY2 == 600){
       checkCatch(raindropX2);
   }

  //third raindrop
    ellipse(raindropX3, raindropY3, 30, 30);
   
  raindropY3 = raindropY3+5;
   
  if(raindropY3>820) {
    raindropX3 =(int)random(20, 750);
    raindropY3 = 0;
    }
    
   if(raindropY3 == 600){
       checkCatch(raindropX3);
   }

  if(score == 30){
  println("you win");
  System.exit(0);
  }




}
