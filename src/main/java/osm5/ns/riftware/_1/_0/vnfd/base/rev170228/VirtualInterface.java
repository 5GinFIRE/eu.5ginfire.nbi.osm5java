package osm5.ns.riftware._1._0.vnfd.base.rev170228;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * grouping virtual-interface {
 *   container virtual-interface {
 *     leaf type {
 *       type enumeration {
 *         enum PARAVIRT;
 *         enum OM-MGMT;
 *         enum PCI-PASSTHROUGH;
 *         enum SR-IOV;
 *         enum VIRTIO;
 *         enum E1000;
 *         enum RTL8139;
 *         enum PCNET;
 *       }
 *       default PARAVIRT;
 *     }
 *     leaf vpci {
 *       type string;
 *     }
 *     leaf bandwidth {
 *       type uint64;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/virtual-interface</i>
 *
 */
public interface VirtualInterface
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("virtual-interface");

    /**
     * Container for the virtual interface properties
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.virtual._interface.VirtualInterface</code> <code>virtualInterface</code>, or <code>null</code> if not present
     */
    @Nullable
    osm5.ns.riftware._1._0.vnfd.base.rev170228.virtual._interface.VirtualInterface getVirtualInterface();

}

