package osm5.ns.yang.nfvo.instantiation.parameters.rev180914.vld_common_params;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.IpProfileUpdateSchema;
import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.VldCommonParams;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * container ip-profile {
 *   uses ip-profile-update-schema;
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/vld_common_params/ip-profile</i>
 * 
 * <p>To create instances of this class use {@link IpProfileBuilder}.
 * @see IpProfileBuilder
 *
 */
public interface IpProfile
    extends
    ChildOf<VldCommonParams>,
    Augmentable<IpProfile>,
    IpProfileUpdateSchema
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ip-profile");


}

