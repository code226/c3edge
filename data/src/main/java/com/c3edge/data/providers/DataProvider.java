
public abstract class DataProvider {

	public DBObject query( DBObject dbObj ) {
	}
	
	public void put( EdgeObject object ) {
	}
	
	public void putAll( EdgeObject[] objects ) {
	}
	
	public void get( String key ) {
	}
	
	public EdgeObjects[] getAll( String[] keys ) {
	}
	
	public void addListener( EdgeObservable observable ) {
	}
	
	public void removeListner( EdgeObservable observable ) {
	}
	
	public void takeSnapshot( long snapshotId ) {
	}
	
	public EdgeObjects[] getSnapshot( long snapshotId ) {
	}
}