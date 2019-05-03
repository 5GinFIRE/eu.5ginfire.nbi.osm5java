package org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.project.nsd.rev170228;
import org.opendaylight.yang.gen.v1.http.riftio.com.ns.riftware._1._0.nsd.base.rev170228.NsdDescriptorCommon;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * grouping nsd-descriptor {
 *   uses nsd-base:nsd-descriptor-common;
 *   uses nsd-vld;
 *   uses nsd-constituent-vnfd;
 *   uses nsd-placement-groups;
 *   uses nsd-vnf-dependency;
 *   uses nsd-monitoring-param;
 *   uses nsd-service-primitive;
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsd-descriptor</i>
 *
 */
public interface NsdDescriptor
    extends
    DataObject,
    NsdMonitoringParam,
    NsdVnfDependency,
    NsdVld,
    NsdConstituentVnfd,
    NsdPlacementGroups,
    NsdServicePrimitive,
    NsdDescriptorCommon
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("nsd-descriptor");


}

