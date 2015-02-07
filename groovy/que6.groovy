class HourMinute{
  int hours,minutes
  HourMinute plus(HourMinute b){
    HourMinute c = new HourMinute(hours:(hours+b.hours),minutes:(minutes+b.minutes));
    if(c.minutes >= 60){
      c.minutes-=60
      c.hours++
    }
    return c
  }
  String toString(){
    hours + ":" + minutes
  }
}
HourMinute a = new HourMinute(hours:10,minutes:40),
b = new HourMinute(hours:5,minutes:30)
HourMinute c = a+b