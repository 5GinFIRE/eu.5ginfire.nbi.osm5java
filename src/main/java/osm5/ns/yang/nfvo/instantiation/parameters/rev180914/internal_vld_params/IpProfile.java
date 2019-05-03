package osm5.ns.yang.nfvo.instantiation.parameters.rev180914.internal_vld_params;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.InternalVldParams;
import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.IpProfileUpdateSchema;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * container ip-profile {
 *   uses ip-profile-update-schema;
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/internal_vld_params/ip-profile</i>
 * 
 * <p>To create instances of this class use {@link IpProfileBuilder}.
 * @see IpProfileBuilder
 *
 */
public interface IpProfile
    extends
    ChildOf<InternalVldParams>,
    Augmentable<IpProfile>,
    IpProfileUpdateSchema
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("ip-profile");


}
