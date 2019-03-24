import static sun.jvm.hotspot.runtime.PerfMemory.start;

abstract class StrategySolution implements Strategy{

    public void solve(){
        start();
        while(nexTry() && !isSolution()){}
        strop();
        }
    }
}
