package hazelcast;

import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.client.impl.HazelcastClientInstanceImpl;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

public class HazelcastClient {
	public static void main(String[] args) {
		ClientConfig clientConfig = new ClientConfig();
        HazelcastInstance client = new HazelcastClientInstanceImpl( clientConfig );
        IMap map = client.getMap( "customers" );
        System.out.println( "Map Size:" + map.size() );
    }
}
