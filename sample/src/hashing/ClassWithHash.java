package hashing;

public class ClassWithHash {

	
public String name;
public int id;

public ClassWithHash(String name){
	this.name = name;
}

@Override
public int hashCode(){
	return name.length();
}

@Override
public boolean equals(Object o){
	if(((ClassWithHash)o).name==name){
		return true;
	}else{
		return false;
	}
	
}
}
