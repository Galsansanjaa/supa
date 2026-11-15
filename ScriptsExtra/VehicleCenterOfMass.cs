using UnityEngine;

[RequireComponent(typeof(Rigidbody2D))]
public class VehicleCenterOfMass : MonoBehaviour
{
    [Header("Center of Mass")]
    [Tooltip("Local position of the center of mass.")]
    [SerializeField] private Vector2 centerOfMass = new Vector2(0.01f, -0.5f);

    private Rigidbody2D rb;

    private void Awake()
    {
        rb = GetComponent<Rigidbody2D>();
        ApplyCenterOfMass();
    }

    private void OnValidate()
    {
        if (rb == null)
            rb = GetComponent<Rigidbody2D>();

        if (rb != null)
            ApplyCenterOfMass();
    }

    public void ApplyCenterOfMass()
    {
        rb.centerOfMass = centerOfMass;
    }

#if UNITY_EDITOR
    private void OnDrawGizmosSelected()
    {
        Rigidbody2D body = GetComponent<Rigidbody2D>();

        if (body == null)
            return;

        Gizmos.color = Color.yellow;

        // centerOfMass is in local Rigidbody2D coordinates.
        Vector3 worldPosition = transform.TransformPoint(body.centerOfMass);
        Gizmos.DrawSphere(worldPosition, 0.08f);
    }
#endif
}