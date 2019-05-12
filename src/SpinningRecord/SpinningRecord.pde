import ddf.minim.*;

PImage pictureOfRecord;
int imageAngle = 0;
Minim minim;
AudioPlayer song;

public void setup(){
  size(600, 600);
  pictureOfRecord= loadImage("record.jpeg");
  pictureOfRecord.resize(600, 600);
  minim = new Minim(this);
  song = minim.loadFile("song2.mp3", 512);
}

void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }

public void draw(){
  rotateImage(pictureOfRecord, imageAngle);
  image(pictureOfRecord, 0, 0);
  if(mousePressed){
    imageAngle=imageAngle+1;
    song.play();
  }
  else{
  song.pause();
  }
}
