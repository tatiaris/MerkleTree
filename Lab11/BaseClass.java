

abstract class BaseClass implements Comparable<Object> {

    public int compareTo(Object o) {
        BaseClass ab = (BaseClass) o;
      if (getWeight() > ab.getWeight()) return 1;
      else if (getWeight() < ab.getWeight()) return -1;
      return 0;
      //return getWeight().compareTo(ab.getWeight());
    }
  
    public abstract float getWeight();
    public abstract Address getAddress();
  }
  