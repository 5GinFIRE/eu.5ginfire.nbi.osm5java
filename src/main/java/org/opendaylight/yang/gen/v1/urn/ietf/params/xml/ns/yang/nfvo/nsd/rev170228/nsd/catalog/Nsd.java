package org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.nsd.catalog;
import java.lang.Override;
import org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.NsdDescriptorCommon;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.NsdCatalog;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.NsdConstituentVnfd;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.NsdMonitoringParam;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.NsdPlacementGroups;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.NsdServicePrimitive;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.NsdVld;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.nfvo.nsd.rev170228.NsdVnfDependency;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * list nsd {
 *   key id;
 *   uses nsd-base:nsd-descriptor-common;
 *   uses nsd-vld;
 *   uses nsd-constituent-vnfd;
 *   uses nsd-placement-groups;
 *   uses nsd-vnf-dependency;
 *   uses nsd-monitoring-param;
 *   uses nsd-service-primitive;
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsd/nsd-catalog/nsd</i>
 * 
 * <p>To create instances of this class use {@link NsdBuilder}.
 * @see NsdBuilder
 * @see NsdKey
 *
 */
public interface Nsd
    extends
    ChildOf<NsdCatalog>,
    Augmentable<Nsd>,
    NsdMonitoringParam,
    NsdServicePrimitive,
    NsdVld,
    NsdConstituentVnfd,
    NsdPlacementGroups,
    NsdDescriptorCommon,
    NsdVnfDependency,
    Identifiable<NsdKey>
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd");

    @Override
    NsdKey key();

}

