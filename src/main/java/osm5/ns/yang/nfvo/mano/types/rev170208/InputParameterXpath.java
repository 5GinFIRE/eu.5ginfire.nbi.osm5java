package osm5.ns.yang.nfvo.mano.types.rev170208;
import java.util.List;
import javax.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping input-parameter-xpath {
 *   list input-parameter-xpath {
 *     key xpath;
 *     leaf xpath {
 *       type string;
 *     }
 *     leaf label {
 *       type string;
 *     }
 *     leaf default-value {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/input-parameter-xpath</i>
 *
 */
public interface InputParameterXpath
    extends
    DataObject
{



    public static final QName QNAME = $YangModuleInfoImpl.qnameOf("input-parameter-xpath");

    /**
     * List of xpaths to parameters inside the NSDthe can be customized during the 
     * instantiation.
     *
     *
     *
     * @return <code>java.util.List</code> <code>inputParameterXpath</code>, or <code>null</code> if not present
     */
    @Nullable
    List<osm5.ns.yang.nfvo.mano.types.rev170208.input.parameter.xpath.InputParameterXpath> getInputParameterXpath();

}

