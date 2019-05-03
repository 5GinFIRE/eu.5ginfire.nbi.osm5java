package OSM5NBIClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.json.JSONObject;
import org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.project.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd;
import org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.project.nsd.rev170228.project.nsd.catalog.Nsd;
import org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.project.vnfd.rev170228.project.vnfd.catalog.Vnfd;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.annotation.JsonProperty;

import OSM5NBIClient.NSInstantiateInstanceRequestPayload.VnF;

public class OSM5NBIClientT {
	
	public static void main(String args[]) {
	    OSM5Client osm5Client = new OSM5Client("https://10.10.10.5:9999","admin","admin","admin");
	    
	    System.out.println("************************");
	    System.out.println("Getting Users");
	    System.out.println("************************");
	    osm5Client.getUsers();
	    System.out.println("************************");
	    System.out.println("Getting VNFPackages");
	    System.out.println("************************");
	    osm5Client.getVNFPackages();		
	    System.out.println("************************");
	    System.out.println("Getting VNFDs");
	    System.out.println("************************");
		Vnfd[] vnfds = osm5Client.getVNFDs();
		for (Vnfd v : vnfds) {
			System.out.println("=== LIST VNFDs POJO object response: " + v.toString());			
		}
		for (Vnfd v : vnfds) {
			System.out.println("=== LIST VNFDs POJO object id: " + v.getId() + ", Name: " + v.getName());
//			Vnfd tmp_vnfd = osm4Client.getVNFDbyID(v.getId());
//			System.out.println("=== LIST VNFDs POJO object id: " + tmp_vnfd.getId() + ", Name: " + tmp_vnfd.getName());			
		}
	    System.out.println("************************");
	    System.out.println("Getting NSDescriptors");
	    System.out.println("************************");
	    osm5Client.getNSDescriptors();		
	    System.out.println("************************");
	    System.out.println("Getting NSDs");
	    System.out.println("************************");
		Nsd[] nsds = osm5Client.getNSDs();
		for (Nsd v : nsds) {
			System.out.println("=== LIST NSDs POJO object response: " + v.toString());
			System.out.println("=== LIST VNFDs POJO object id: " + v.getId() + ", Name: " + v.getName());			
//			Nsd tmp_nsd = osm4Client.getNSDbyID(v.getId());
//			System.out.println("=== LIST VNFDs POJO object id: " + tmp_nsd.getId() + ", Name: " + tmp_nsd.getName());			
		}
		System.out.println("Working Directory = " +System.getProperty("user.dir"));
		
		//Create VNFD
	    System.out.println("************************");
	    System.out.println("Creating VNF Instance");
	    System.out.println("************************");
		ResponseEntity<String> response = null;
		response = osm5Client.createVNFDPackage();
		if (response == null || response.getStatusCode().is4xxClientError() || response.getStatusCode().is5xxServerError()) {
			System.out.println("VNFD Package Creation failed.");
			return;				
		}
		else
		{
			JSONObject obj = new JSONObject(response.getBody());
			String vnfd_id = obj.getString("id");
			System.out.println(response.getStatusCode()+" replied. The new VNFD Package id is :" + vnfd_id);
		    System.out.println("Uploading VNF Package from URL");
		    System.out.println("************************");
		    String vnfd_package_path = "https://osm-download.etsi.org/ftp/osm-5.0-five/5th-hackfest/packages/frrvnf_vnfd.tar.gz";
			try {
				response = osm5Client.uploadVNFDPackageContent(vnfd_id, vnfd_package_path);
				if (response == null || response.getStatusCode().is4xxClientError()
						|| response.getStatusCode().is5xxServerError()) {
					System.out.println("Upload of VNFD Package Content failed. Deleting VNFD Package.");
					// Delete the package from the OSM
					osm5Client.deleteVNFDPackage(vnfd_id);
					return;
				}
				else
				{
					System.out.println("VNFD Package uploaded successfully");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//	    System.out.println("************************");
//	    System.out.println("Uploading VNF Zip from local file");
//	    System.out.println("************************");
//		String vnfd_zip_path = "./src/main/resources/temp/cirros_vnf.tar.gz";
//		try 
//		{
//			osm5Client.uploadVNFDZip(vnfd_id, vnfd_zip_path);
//		}
//		catch(IOException e)
//		{
//			System.out.println(e.getMessage());
//			return;
//		}

	    System.out.println("Uploading NSD Package from URL");
	    System.out.println("************************");
	    String nsd_package_path = "https://osm-download.etsi.org/ftp/osm-5.0-five/5th-hackfest/packages/frrvnf_nsd.tar.gz";
	    String nsd_id = null;
		response = osm5Client.createNSDPackage();
		if (response == null || response.getStatusCode().is4xxClientError() || response.getStatusCode().is5xxServerError()) {
			System.out.println("NSD Package Creation failed.");
			return;				
		}
		else
		{
			JSONObject obj = new JSONObject(response.getBody());
			nsd_id = obj.getString("id");
			System.out.println(response.getStatusCode()+" replied. The new NSD Package id is :" + nsd_id);
		    System.out.println("Uploading NS Package from URL");
		    System.out.println("************************");
			try {
				response = osm5Client.uploadNSDPackageContent(nsd_id, nsd_package_path);
				if (response == null || response.getStatusCode().is4xxClientError()
						|| response.getStatusCode().is5xxServerError()) {
					System.out.println("Upload of NSD Package Content failed. Deleting NSD Package.");
					// Delete the package from the OSM
					osm5Client.deleteVNFDPackage(nsd_id);
					return;
				}
				else
				{
					System.out.println("NSD Package uploaded successfully");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
//		//Create NSD
//	    System.out.println("************************");
//	    System.out.println("Uploading NSD Zip from local file");
//	    System.out.println("************************");
//	    System.out.println("************************");
//	    System.out.println("Creating NSD Instance");
//	    System.out.println("************************");
//		String nsd_id = osm4Client.createNSDPackage();
//		// TODO Handle failure acquiring a vnfd_id
//	    System.out.println("************************");
//	    System.out.println("Uploading NSD Zip");
//	    System.out.println("************************");
//		String nsd_zip_path = "C:/EP/OSMDEVOPS/OSMvFIVE_NSDs/cirros_2vnf_ns_b.tar.gz";
//		osm4Client.uploadNSDZip(nsd_id, nsd_zip_path);		

		//Create NS Instance
//	    System.out.println("************************");
//	    System.out.println("Creating NS Instance");
//	    System.out.println("************************");
//		String vim_id="8e0929c5-4cc2-4a78-887f-d3642336e18c";
//		String ns_instance_id = osm5Client.createNSInstance(vim_id, nsd_id);
//		if(ns_instance_id!=null)
//		{
//			osm5Client.InstantiateNSInstance(ns_instance_id);
//		}
//		pressAnyKeyToContinue();
//		if(ns_instance_id!=null)
//		{
//			osm5Client.deleteNSInstance(ns_instance_id);
//		}
		
		List<ConstituentVnfd> constituentVnfds = osm5Client.getNSDbyID(nsd_id).getConstituentVnfd();
		NSCreateInstanceRequestPayload nscreateinstancerequestpayload = new NSCreateInstanceRequestPayload();
		nscreateinstancerequestpayload.setNsName("test");
		nscreateinstancerequestpayload.setVimAccountId("691c8956-0369-4b91-b914-b61dccba74db");
		// Here we need to get the ExperimentOnBoardDescriptor based on the Experiment.
		// An Experiment might have multiple OnBoardDescriptors if it is OnBoarded to multiple OSM MANOs.
		// We temporarily select the first (and most probably the only one). 
		// Otherwise the user needs to define the OSM MANO where the Experiment is OnBoarded in order to instantiate.
		nscreateinstancerequestpayload.setNsdId(nsd_id);
		Integer count = 1;
		for(ConstituentVnfd constituenVnfd : constituentVnfds)
		{
			OSM5NBIClient.NSInstantiateInstanceRequestPayload.VnF vnf_tmp = nscreateinstancerequestpayload.new VnF();  
			vnf_tmp.setMemberVnFIndex(count.toString());
			vnf_tmp.setVimAccount("691c8956-0369-4b91-b914-b61dccba74db");
			nscreateinstancerequestpayload.getVnf().add(vnf_tmp);			
		}
		
		// Get Experiment ID and VIM ID and create NS Instance.
		System.out.println("NS Instance creation payload : " + nscreateinstancerequestpayload.toJSON());
		ResponseEntity<String> ns_instance_creation_entity = osm5Client.createNSInstance(nscreateinstancerequestpayload.toJSON());
		// The NS Instance ID is set

		// NS instance creation
		if (ns_instance_creation_entity == null || ns_instance_creation_entity.getStatusCode().is4xxClientError()
				|| ns_instance_creation_entity.getStatusCode().is5xxServerError()) {
			// NS instance creation failed
			System.out.println("NS Instance creation failed with response: "+ ns_instance_creation_entity.getBody().toString());
		} else {
			// String nsr_id =
			JSONObject ns_instance_creation_entity_json_obj = new JSONObject(ns_instance_creation_entity.getBody());
			String nsd_instance_id = ns_instance_creation_entity_json_obj.getString("id");
			// Instantiate NS Instance
			NSInstantiateInstanceRequestPayload nsrequestpayload = new NSInstantiateInstanceRequestPayload();
			nsrequestpayload.setNsName("test");
			nsrequestpayload.setVimAccountId("691c8956-0369-4b91-b914-b61dccba74db");
			nsrequestpayload.setNsdId(nsd_id);
			count = 1;
			for(ConstituentVnfd constituenVnfd : constituentVnfds)
			{
				OSM5NBIClient.NSInstantiateInstanceRequestPayload.VnF vnf_tmp = nsrequestpayload.new VnF();  
				vnf_tmp.setMemberVnFIndex(count.toString());
				vnf_tmp.setVimAccount("691c8956-0369-4b91-b914-b61dccba74db");
				nsrequestpayload.getVnf().add(vnf_tmp);			
			}
			
			System.out.println("NS Instantiation payload : " + nsrequestpayload.toJSON());
			// Here we need the feedback
			ResponseEntity<String> instantiate_ns_instance_entity = osm5Client.instantiateNSInstance(nsd_instance_id, nsrequestpayload.toJSON());
			if (instantiate_ns_instance_entity == null || instantiate_ns_instance_entity.getStatusCode().is4xxClientError() || instantiate_ns_instance_entity.getStatusCode().is5xxServerError()) {
				System.out.println("NS Instantiation failed. Status Code:"
						+ instantiate_ns_instance_entity.getStatusCode().toString() + ", Payload:"
						+ ns_instance_creation_entity.getBody().toString());
			} else {
				// NS Instantiation starts
				System.out.println("NS Instantiation of NS with id" + nsd_instance_id + " started.");
				// Save the changes to DeploymentDescriptor
			}
		}
		
		
	}
//	public OSM4Client() {	
//		// Properties file path.
//		String filePath = "osm4.properties.xml";
//		Properties prop = new Properties();
//		try (InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(filePath)) {
//			 
//			// Loading the properties.
//			prop.loadFromXML(inputStream);
// 
//			// Getting properties
//			this.manoApiEndpoint = prop.getProperty("osm4.apiEndPoint");
//			this.manoUsername = prop.getProperty("osm4.username");
//			this.manoPassword = prop.getProperty("osm4.password");
//			this.manoProjectId = prop.getProperty("osm4.projectId");			
//		} catch (IOException ex) {
//			logger.error("Problem while reading properties file !");
//			ex.printStackTrace();
//		} 		
//		
//		OSM4ClientInit();
//	}
	
}