package osm5.ns.yang.nfvo.instantiation.parameters.rev180914.ns_params;
import java.lang.Override;

import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.$YangModuleInfoImpl;
import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.NsParams;
import osm5.ns.yang.nfvo.instantiation.parameters.rev180914.VldParams;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>instantiation-parameters</b>
 * <pre>
 * list vld {
 *   key name;
 *   uses vld_params;
 * }
 * </pre>The schema path to identify an instance is
 * <i>instantiation-parameters/ns_params/vld</i>
 * 
 * <p>To create instances of this class use {@link VldBuilder}.
 * @see VldBuilder
 * @see VldKey
 *
 */
public interface Vld
    extends
    ChildOf<NsParams>,
    Augmentable<Vld>,
    VldParams,
    Identifiable<VldKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("vld");

    @Override
    VldKey key();

}

