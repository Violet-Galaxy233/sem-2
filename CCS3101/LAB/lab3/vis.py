import matplotlib.pyplot as plt
import math

def distance(p1, p2):
    return math.hypot(p1[0] - p2[0], p1[1] - p2[1])

def polygon_area(points):
    """Shoelace formula for area of convex quadrilaterals and triangles"""
    n = len(points)
    return 0.5 * abs(sum(points[i][0]*points[(i+1)%n][1] - points[(i+1)%n][0]*points[i][1] for i in range(n)))

def draw_shape(ax, points, label, color):
    x = [p[0] for p in points] + [points[0][0]]
    y = [p[1] for p in points] + [points[0][1]]
    ax.plot(x, y, marker='o', label=label, color=color)
    for i, (x_i, y_i) in enumerate(points):
        ax.text(x_i, y_i, f"{chr(65+i)}", fontsize=10, ha='right', va='bottom')

shapes = [
    # name, points, color
    ("Trapezoid", [(0,0), (6,0), (4,3), (2,3)], "red"),
    ("Parallelogram", [(8,0), (12,0), (11,3), (7,3)], "blue"),
    ("Rectangle", [(0,4), (4,4), (4,9), (0,9)], "green"),
    ("Square", [(6,5), (8,5), (8,7), (6,7)], "purple"),
]

fig, ax = plt.subplots(figsize=(10, 10))
ax.set_title("Geometric Shapes with Area", fontsize=16)
ax.set_aspect('equal')
ax.grid(True)

for name, pts, color in shapes:
    area = polygon_area(pts)
    draw_shape(ax, pts, f"{name} (Area: {area})", color)

ax.legend(loc='upper left', fontsize=10)
plt.show()
