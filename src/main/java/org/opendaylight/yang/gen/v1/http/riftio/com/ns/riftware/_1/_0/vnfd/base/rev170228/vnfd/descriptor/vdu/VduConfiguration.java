package org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.vdu;
import org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.vnfd.base.rev170228.vnfd.descriptor.Vdu;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.mano.types.rev170208.VcaConfiguration;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfd-base</b>
 * <pre>
 * container vdu-configuration {
 *   uses manotypes:vca-configuration;
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfd-base/vnfd-descriptor/vdu/vdu-configuration</i>
 * 
 * <p>To create instances of this class use {@link VduConfigurationBuilder}.
 * @see VduConfigurationBuilder
 *
 */
public interface VduConfiguration
    extends
    ChildOf<Vdu>,
    Augmentable<VduConfiguration>,
    VcaConfiguration
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vdu-configuration");


}

