float x=0;
float y=0;
int m = 0;

void setup() {
  size(1960, 1080);
  background(255, 255, 255);
}

void draw() {
  makeMagical();
  if(mousePressed){
  m++;
  }
  for(int i = 0; i<m; i++){
    fill(random(256), random(256), random(256));
    x=random(1960);
    y=random(1080);
    ellipse(getWormX(i), getWormY(i), 20, 20);
  }
}

float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}
