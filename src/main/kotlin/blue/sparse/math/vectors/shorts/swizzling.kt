@file:Suppress("unused")

package blue.sparse.math.vectors.shorts

val Short.xx: Vector2s get() = Vector2s(this, this)
val Short.xxx: Vector3s get() = Vector3s(this, this, this)
val Short.xxxx: Vector4s get() = Vector4s(this, this, this, this)

/*
-----------------------------------------
	Generated swizzling code for Vector2s
-----------------------------------------
 */

val Vector2s.xx  : Vector2s get() = Vector2s(x, x)
val Vector2s.xy  : Vector2s get() = Vector2s(x, y)
val Vector2s.yx  : Vector2s get() = Vector2s(y, x)
val Vector2s.yy  : Vector2s get() = Vector2s(y, y)
val Vector2s.xxx : Vector3s get() = Vector3s(x, x, x)
val Vector2s.xxy : Vector3s get() = Vector3s(x, x, y)
val Vector2s.xyx : Vector3s get() = Vector3s(x, y, x)
val Vector2s.xyy : Vector3s get() = Vector3s(x, y, y)
val Vector2s.yxx : Vector3s get() = Vector3s(y, x, x)
val Vector2s.yxy : Vector3s get() = Vector3s(y, x, y)
val Vector2s.yyx : Vector3s get() = Vector3s(y, y, x)
val Vector2s.yyy : Vector3s get() = Vector3s(y, y, y)
val Vector2s.xxxx: Vector4s get() = Vector4s(x, x, x, x)
val Vector2s.xxxy: Vector4s get() = Vector4s(x, x, x, y)
val Vector2s.xxyx: Vector4s get() = Vector4s(x, x, y, x)
val Vector2s.xxyy: Vector4s get() = Vector4s(x, x, y, y)
val Vector2s.xyxx: Vector4s get() = Vector4s(x, y, x, x)
val Vector2s.xyxy: Vector4s get() = Vector4s(x, y, x, y)
val Vector2s.xyyx: Vector4s get() = Vector4s(x, y, y, x)
val Vector2s.xyyy: Vector4s get() = Vector4s(x, y, y, y)
val Vector2s.yxxx: Vector4s get() = Vector4s(y, x, x, x)
val Vector2s.yxxy: Vector4s get() = Vector4s(y, x, x, y)
val Vector2s.yxyx: Vector4s get() = Vector4s(y, x, y, x)
val Vector2s.yxyy: Vector4s get() = Vector4s(y, x, y, y)
val Vector2s.yyxx: Vector4s get() = Vector4s(y, y, x, x)
val Vector2s.yyxy: Vector4s get() = Vector4s(y, y, x, y)
val Vector2s.yyyx: Vector4s get() = Vector4s(y, y, y, x)
val Vector2s.yyyy: Vector4s get() = Vector4s(y, y, y, y)


/*
-----------------------------------------
	Generated swizzling code for Vector3s
-----------------------------------------
 */

val Vector3s.xx: Vector2s get() = Vector2s(x, x)
val Vector3s.xy: Vector2s get() = Vector2s(x, y)
val Vector3s.xz: Vector2s get() = Vector2s(x, z)
val Vector3s.yx: Vector2s get() = Vector2s(y, x)
val Vector3s.yy: Vector2s get() = Vector2s(y, y)
val Vector3s.yz: Vector2s get() = Vector2s(y, z)
val Vector3s.zx: Vector2s get() = Vector2s(z, x)
val Vector3s.zy: Vector2s get() = Vector2s(z, y)
val Vector3s.zz: Vector2s get() = Vector2s(z, z)
val Vector3s.xxx: Vector3s get() = Vector3s(x, x, x)
val Vector3s.xxy: Vector3s get() = Vector3s(x, x, y)
val Vector3s.xxz: Vector3s get() = Vector3s(x, x, z)
val Vector3s.xyx: Vector3s get() = Vector3s(x, y, x)
val Vector3s.xyy: Vector3s get() = Vector3s(x, y, y)
val Vector3s.xyz: Vector3s get() = Vector3s(x, y, z)
val Vector3s.xzx: Vector3s get() = Vector3s(x, z, x)
val Vector3s.xzy: Vector3s get() = Vector3s(x, z, y)
val Vector3s.xzz: Vector3s get() = Vector3s(x, z, z)
val Vector3s.yxx: Vector3s get() = Vector3s(y, x, x)
val Vector3s.yxy: Vector3s get() = Vector3s(y, x, y)
val Vector3s.yxz: Vector3s get() = Vector3s(y, x, z)
val Vector3s.yyx: Vector3s get() = Vector3s(y, y, x)
val Vector3s.yyy: Vector3s get() = Vector3s(y, y, y)
val Vector3s.yyz: Vector3s get() = Vector3s(y, y, z)
val Vector3s.yzx: Vector3s get() = Vector3s(y, z, x)
val Vector3s.yzy: Vector3s get() = Vector3s(y, z, y)
val Vector3s.yzz: Vector3s get() = Vector3s(y, z, z)
val Vector3s.zxx: Vector3s get() = Vector3s(z, x, x)
val Vector3s.zxy: Vector3s get() = Vector3s(z, x, y)
val Vector3s.zxz: Vector3s get() = Vector3s(z, x, z)
val Vector3s.zyx: Vector3s get() = Vector3s(z, y, x)
val Vector3s.zyy: Vector3s get() = Vector3s(z, y, y)
val Vector3s.zyz: Vector3s get() = Vector3s(z, y, z)
val Vector3s.zzx: Vector3s get() = Vector3s(z, z, x)
val Vector3s.zzy: Vector3s get() = Vector3s(z, z, y)
val Vector3s.zzz: Vector3s get() = Vector3s(z, z, z)
val Vector3s.xxxx: Vector4s get() = Vector4s(x, x, x, x)
val Vector3s.xxxy: Vector4s get() = Vector4s(x, x, x, y)
val Vector3s.xxxz: Vector4s get() = Vector4s(x, x, x, z)
val Vector3s.xxyx: Vector4s get() = Vector4s(x, x, y, x)
val Vector3s.xxyy: Vector4s get() = Vector4s(x, x, y, y)
val Vector3s.xxyz: Vector4s get() = Vector4s(x, x, y, z)
val Vector3s.xxzx: Vector4s get() = Vector4s(x, x, z, x)
val Vector3s.xxzy: Vector4s get() = Vector4s(x, x, z, y)
val Vector3s.xxzz: Vector4s get() = Vector4s(x, x, z, z)
val Vector3s.xyxx: Vector4s get() = Vector4s(x, y, x, x)
val Vector3s.xyxy: Vector4s get() = Vector4s(x, y, x, y)
val Vector3s.xyxz: Vector4s get() = Vector4s(x, y, x, z)
val Vector3s.xyyx: Vector4s get() = Vector4s(x, y, y, x)
val Vector3s.xyyy: Vector4s get() = Vector4s(x, y, y, y)
val Vector3s.xyyz: Vector4s get() = Vector4s(x, y, y, z)
val Vector3s.xyzx: Vector4s get() = Vector4s(x, y, z, x)
val Vector3s.xyzy: Vector4s get() = Vector4s(x, y, z, y)
val Vector3s.xyzz: Vector4s get() = Vector4s(x, y, z, z)
val Vector3s.xzxx: Vector4s get() = Vector4s(x, z, x, x)
val Vector3s.xzxy: Vector4s get() = Vector4s(x, z, x, y)
val Vector3s.xzxz: Vector4s get() = Vector4s(x, z, x, z)
val Vector3s.xzyx: Vector4s get() = Vector4s(x, z, y, x)
val Vector3s.xzyy: Vector4s get() = Vector4s(x, z, y, y)
val Vector3s.xzyz: Vector4s get() = Vector4s(x, z, y, z)
val Vector3s.xzzx: Vector4s get() = Vector4s(x, z, z, x)
val Vector3s.xzzy: Vector4s get() = Vector4s(x, z, z, y)
val Vector3s.xzzz: Vector4s get() = Vector4s(x, z, z, z)
val Vector3s.yxxx: Vector4s get() = Vector4s(y, x, x, x)
val Vector3s.yxxy: Vector4s get() = Vector4s(y, x, x, y)
val Vector3s.yxxz: Vector4s get() = Vector4s(y, x, x, z)
val Vector3s.yxyx: Vector4s get() = Vector4s(y, x, y, x)
val Vector3s.yxyy: Vector4s get() = Vector4s(y, x, y, y)
val Vector3s.yxyz: Vector4s get() = Vector4s(y, x, y, z)
val Vector3s.yxzx: Vector4s get() = Vector4s(y, x, z, x)
val Vector3s.yxzy: Vector4s get() = Vector4s(y, x, z, y)
val Vector3s.yxzz: Vector4s get() = Vector4s(y, x, z, z)
val Vector3s.yyxx: Vector4s get() = Vector4s(y, y, x, x)
val Vector3s.yyxy: Vector4s get() = Vector4s(y, y, x, y)
val Vector3s.yyxz: Vector4s get() = Vector4s(y, y, x, z)
val Vector3s.yyyx: Vector4s get() = Vector4s(y, y, y, x)
val Vector3s.yyyy: Vector4s get() = Vector4s(y, y, y, y)
val Vector3s.yyyz: Vector4s get() = Vector4s(y, y, y, z)
val Vector3s.yyzx: Vector4s get() = Vector4s(y, y, z, x)
val Vector3s.yyzy: Vector4s get() = Vector4s(y, y, z, y)
val Vector3s.yyzz: Vector4s get() = Vector4s(y, y, z, z)
val Vector3s.yzxx: Vector4s get() = Vector4s(y, z, x, x)
val Vector3s.yzxy: Vector4s get() = Vector4s(y, z, x, y)
val Vector3s.yzxz: Vector4s get() = Vector4s(y, z, x, z)
val Vector3s.yzyx: Vector4s get() = Vector4s(y, z, y, x)
val Vector3s.yzyy: Vector4s get() = Vector4s(y, z, y, y)
val Vector3s.yzyz: Vector4s get() = Vector4s(y, z, y, z)
val Vector3s.yzzx: Vector4s get() = Vector4s(y, z, z, x)
val Vector3s.yzzy: Vector4s get() = Vector4s(y, z, z, y)
val Vector3s.yzzz: Vector4s get() = Vector4s(y, z, z, z)
val Vector3s.zxxx: Vector4s get() = Vector4s(z, x, x, x)
val Vector3s.zxxy: Vector4s get() = Vector4s(z, x, x, y)
val Vector3s.zxxz: Vector4s get() = Vector4s(z, x, x, z)
val Vector3s.zxyx: Vector4s get() = Vector4s(z, x, y, x)
val Vector3s.zxyy: Vector4s get() = Vector4s(z, x, y, y)
val Vector3s.zxyz: Vector4s get() = Vector4s(z, x, y, z)
val Vector3s.zxzx: Vector4s get() = Vector4s(z, x, z, x)
val Vector3s.zxzy: Vector4s get() = Vector4s(z, x, z, y)
val Vector3s.zxzz: Vector4s get() = Vector4s(z, x, z, z)
val Vector3s.zyxx: Vector4s get() = Vector4s(z, y, x, x)
val Vector3s.zyxy: Vector4s get() = Vector4s(z, y, x, y)
val Vector3s.zyxz: Vector4s get() = Vector4s(z, y, x, z)
val Vector3s.zyyx: Vector4s get() = Vector4s(z, y, y, x)
val Vector3s.zyyy: Vector4s get() = Vector4s(z, y, y, y)
val Vector3s.zyyz: Vector4s get() = Vector4s(z, y, y, z)
val Vector3s.zyzx: Vector4s get() = Vector4s(z, y, z, x)
val Vector3s.zyzy: Vector4s get() = Vector4s(z, y, z, y)
val Vector3s.zyzz: Vector4s get() = Vector4s(z, y, z, z)
val Vector3s.zzxx: Vector4s get() = Vector4s(z, z, x, x)
val Vector3s.zzxy: Vector4s get() = Vector4s(z, z, x, y)
val Vector3s.zzxz: Vector4s get() = Vector4s(z, z, x, z)
val Vector3s.zzyx: Vector4s get() = Vector4s(z, z, y, x)
val Vector3s.zzyy: Vector4s get() = Vector4s(z, z, y, y)
val Vector3s.zzyz: Vector4s get() = Vector4s(z, z, y, z)
val Vector3s.zzzx: Vector4s get() = Vector4s(z, z, z, x)
val Vector3s.zzzy: Vector4s get() = Vector4s(z, z, z, y)
val Vector3s.zzzz: Vector4s get() = Vector4s(z, z, z, z)


/*
-----------------------------------------
	Generated swizzling code for Vector4s
-----------------------------------------
 */

val Vector4s.xx: Vector2s get() = Vector2s(x, x)
val Vector4s.xy: Vector2s get() = Vector2s(x, y)
val Vector4s.xz: Vector2s get() = Vector2s(x, z)
val Vector4s.xw: Vector2s get() = Vector2s(x, w)
val Vector4s.yx: Vector2s get() = Vector2s(y, x)
val Vector4s.yy: Vector2s get() = Vector2s(y, y)
val Vector4s.yz: Vector2s get() = Vector2s(y, z)
val Vector4s.yw: Vector2s get() = Vector2s(y, w)
val Vector4s.zx: Vector2s get() = Vector2s(z, x)
val Vector4s.zy: Vector2s get() = Vector2s(z, y)
val Vector4s.zz: Vector2s get() = Vector2s(z, z)
val Vector4s.zw: Vector2s get() = Vector2s(z, w)
val Vector4s.wx: Vector2s get() = Vector2s(w, x)
val Vector4s.wy: Vector2s get() = Vector2s(w, y)
val Vector4s.wz: Vector2s get() = Vector2s(w, z)
val Vector4s.ww: Vector2s get() = Vector2s(w, w)
val Vector4s.xxx: Vector3s get() = Vector3s(x, x, x)
val Vector4s.xxy: Vector3s get() = Vector3s(x, x, y)
val Vector4s.xxz: Vector3s get() = Vector3s(x, x, z)
val Vector4s.xxw: Vector3s get() = Vector3s(x, x, w)
val Vector4s.xyx: Vector3s get() = Vector3s(x, y, x)
val Vector4s.xyy: Vector3s get() = Vector3s(x, y, y)
val Vector4s.xyz: Vector3s get() = Vector3s(x, y, z)
val Vector4s.xyw: Vector3s get() = Vector3s(x, y, w)
val Vector4s.xzx: Vector3s get() = Vector3s(x, z, x)
val Vector4s.xzy: Vector3s get() = Vector3s(x, z, y)
val Vector4s.xzz: Vector3s get() = Vector3s(x, z, z)
val Vector4s.xzw: Vector3s get() = Vector3s(x, z, w)
val Vector4s.xwx: Vector3s get() = Vector3s(x, w, x)
val Vector4s.xwy: Vector3s get() = Vector3s(x, w, y)
val Vector4s.xwz: Vector3s get() = Vector3s(x, w, z)
val Vector4s.xww: Vector3s get() = Vector3s(x, w, w)
val Vector4s.yxx: Vector3s get() = Vector3s(y, x, x)
val Vector4s.yxy: Vector3s get() = Vector3s(y, x, y)
val Vector4s.yxz: Vector3s get() = Vector3s(y, x, z)
val Vector4s.yxw: Vector3s get() = Vector3s(y, x, w)
val Vector4s.yyx: Vector3s get() = Vector3s(y, y, x)
val Vector4s.yyy: Vector3s get() = Vector3s(y, y, y)
val Vector4s.yyz: Vector3s get() = Vector3s(y, y, z)
val Vector4s.yyw: Vector3s get() = Vector3s(y, y, w)
val Vector4s.yzx: Vector3s get() = Vector3s(y, z, x)
val Vector4s.yzy: Vector3s get() = Vector3s(y, z, y)
val Vector4s.yzz: Vector3s get() = Vector3s(y, z, z)
val Vector4s.yzw: Vector3s get() = Vector3s(y, z, w)
val Vector4s.ywx: Vector3s get() = Vector3s(y, w, x)
val Vector4s.ywy: Vector3s get() = Vector3s(y, w, y)
val Vector4s.ywz: Vector3s get() = Vector3s(y, w, z)
val Vector4s.yww: Vector3s get() = Vector3s(y, w, w)
val Vector4s.zxx: Vector3s get() = Vector3s(z, x, x)
val Vector4s.zxy: Vector3s get() = Vector3s(z, x, y)
val Vector4s.zxz: Vector3s get() = Vector3s(z, x, z)
val Vector4s.zxw: Vector3s get() = Vector3s(z, x, w)
val Vector4s.zyx: Vector3s get() = Vector3s(z, y, x)
val Vector4s.zyy: Vector3s get() = Vector3s(z, y, y)
val Vector4s.zyz: Vector3s get() = Vector3s(z, y, z)
val Vector4s.zyw: Vector3s get() = Vector3s(z, y, w)
val Vector4s.zzx: Vector3s get() = Vector3s(z, z, x)
val Vector4s.zzy: Vector3s get() = Vector3s(z, z, y)
val Vector4s.zzz: Vector3s get() = Vector3s(z, z, z)
val Vector4s.zzw: Vector3s get() = Vector3s(z, z, w)
val Vector4s.zwx: Vector3s get() = Vector3s(z, w, x)
val Vector4s.zwy: Vector3s get() = Vector3s(z, w, y)
val Vector4s.zwz: Vector3s get() = Vector3s(z, w, z)
val Vector4s.zww: Vector3s get() = Vector3s(z, w, w)
val Vector4s.wxx: Vector3s get() = Vector3s(w, x, x)
val Vector4s.wxy: Vector3s get() = Vector3s(w, x, y)
val Vector4s.wxz: Vector3s get() = Vector3s(w, x, z)
val Vector4s.wxw: Vector3s get() = Vector3s(w, x, w)
val Vector4s.wyx: Vector3s get() = Vector3s(w, y, x)
val Vector4s.wyy: Vector3s get() = Vector3s(w, y, y)
val Vector4s.wyz: Vector3s get() = Vector3s(w, y, z)
val Vector4s.wyw: Vector3s get() = Vector3s(w, y, w)
val Vector4s.wzx: Vector3s get() = Vector3s(w, z, x)
val Vector4s.wzy: Vector3s get() = Vector3s(w, z, y)
val Vector4s.wzz: Vector3s get() = Vector3s(w, z, z)
val Vector4s.wzw: Vector3s get() = Vector3s(w, z, w)
val Vector4s.wwx: Vector3s get() = Vector3s(w, w, x)
val Vector4s.wwy: Vector3s get() = Vector3s(w, w, y)
val Vector4s.wwz: Vector3s get() = Vector3s(w, w, z)
val Vector4s.www: Vector3s get() = Vector3s(w, w, w)
val Vector4s.xxxx: Vector4s get() = Vector4s(x, x, x, x)
val Vector4s.xxxy: Vector4s get() = Vector4s(x, x, x, y)
val Vector4s.xxxz: Vector4s get() = Vector4s(x, x, x, z)
val Vector4s.xxxw: Vector4s get() = Vector4s(x, x, x, w)
val Vector4s.xxyx: Vector4s get() = Vector4s(x, x, y, x)
val Vector4s.xxyy: Vector4s get() = Vector4s(x, x, y, y)
val Vector4s.xxyz: Vector4s get() = Vector4s(x, x, y, z)
val Vector4s.xxyw: Vector4s get() = Vector4s(x, x, y, w)
val Vector4s.xxzx: Vector4s get() = Vector4s(x, x, z, x)
val Vector4s.xxzy: Vector4s get() = Vector4s(x, x, z, y)
val Vector4s.xxzz: Vector4s get() = Vector4s(x, x, z, z)
val Vector4s.xxzw: Vector4s get() = Vector4s(x, x, z, w)
val Vector4s.xxwx: Vector4s get() = Vector4s(x, x, w, x)
val Vector4s.xxwy: Vector4s get() = Vector4s(x, x, w, y)
val Vector4s.xxwz: Vector4s get() = Vector4s(x, x, w, z)
val Vector4s.xxww: Vector4s get() = Vector4s(x, x, w, w)
val Vector4s.xyxx: Vector4s get() = Vector4s(x, y, x, x)
val Vector4s.xyxy: Vector4s get() = Vector4s(x, y, x, y)
val Vector4s.xyxz: Vector4s get() = Vector4s(x, y, x, z)
val Vector4s.xyxw: Vector4s get() = Vector4s(x, y, x, w)
val Vector4s.xyyx: Vector4s get() = Vector4s(x, y, y, x)
val Vector4s.xyyy: Vector4s get() = Vector4s(x, y, y, y)
val Vector4s.xyyz: Vector4s get() = Vector4s(x, y, y, z)
val Vector4s.xyyw: Vector4s get() = Vector4s(x, y, y, w)
val Vector4s.xyzx: Vector4s get() = Vector4s(x, y, z, x)
val Vector4s.xyzy: Vector4s get() = Vector4s(x, y, z, y)
val Vector4s.xyzz: Vector4s get() = Vector4s(x, y, z, z)
val Vector4s.xyzw: Vector4s get() = Vector4s(x, y, z, w)
val Vector4s.xywx: Vector4s get() = Vector4s(x, y, w, x)
val Vector4s.xywy: Vector4s get() = Vector4s(x, y, w, y)
val Vector4s.xywz: Vector4s get() = Vector4s(x, y, w, z)
val Vector4s.xyww: Vector4s get() = Vector4s(x, y, w, w)
val Vector4s.xzxx: Vector4s get() = Vector4s(x, z, x, x)
val Vector4s.xzxy: Vector4s get() = Vector4s(x, z, x, y)
val Vector4s.xzxz: Vector4s get() = Vector4s(x, z, x, z)
val Vector4s.xzxw: Vector4s get() = Vector4s(x, z, x, w)
val Vector4s.xzyx: Vector4s get() = Vector4s(x, z, y, x)
val Vector4s.xzyy: Vector4s get() = Vector4s(x, z, y, y)
val Vector4s.xzyz: Vector4s get() = Vector4s(x, z, y, z)
val Vector4s.xzyw: Vector4s get() = Vector4s(x, z, y, w)
val Vector4s.xzzx: Vector4s get() = Vector4s(x, z, z, x)
val Vector4s.xzzy: Vector4s get() = Vector4s(x, z, z, y)
val Vector4s.xzzz: Vector4s get() = Vector4s(x, z, z, z)
val Vector4s.xzzw: Vector4s get() = Vector4s(x, z, z, w)
val Vector4s.xzwx: Vector4s get() = Vector4s(x, z, w, x)
val Vector4s.xzwy: Vector4s get() = Vector4s(x, z, w, y)
val Vector4s.xzwz: Vector4s get() = Vector4s(x, z, w, z)
val Vector4s.xzww: Vector4s get() = Vector4s(x, z, w, w)
val Vector4s.xwxx: Vector4s get() = Vector4s(x, w, x, x)
val Vector4s.xwxy: Vector4s get() = Vector4s(x, w, x, y)
val Vector4s.xwxz: Vector4s get() = Vector4s(x, w, x, z)
val Vector4s.xwxw: Vector4s get() = Vector4s(x, w, x, w)
val Vector4s.xwyx: Vector4s get() = Vector4s(x, w, y, x)
val Vector4s.xwyy: Vector4s get() = Vector4s(x, w, y, y)
val Vector4s.xwyz: Vector4s get() = Vector4s(x, w, y, z)
val Vector4s.xwyw: Vector4s get() = Vector4s(x, w, y, w)
val Vector4s.xwzx: Vector4s get() = Vector4s(x, w, z, x)
val Vector4s.xwzy: Vector4s get() = Vector4s(x, w, z, y)
val Vector4s.xwzz: Vector4s get() = Vector4s(x, w, z, z)
val Vector4s.xwzw: Vector4s get() = Vector4s(x, w, z, w)
val Vector4s.xwwx: Vector4s get() = Vector4s(x, w, w, x)
val Vector4s.xwwy: Vector4s get() = Vector4s(x, w, w, y)
val Vector4s.xwwz: Vector4s get() = Vector4s(x, w, w, z)
val Vector4s.xwww: Vector4s get() = Vector4s(x, w, w, w)
val Vector4s.yxxx: Vector4s get() = Vector4s(y, x, x, x)
val Vector4s.yxxy: Vector4s get() = Vector4s(y, x, x, y)
val Vector4s.yxxz: Vector4s get() = Vector4s(y, x, x, z)
val Vector4s.yxxw: Vector4s get() = Vector4s(y, x, x, w)
val Vector4s.yxyx: Vector4s get() = Vector4s(y, x, y, x)
val Vector4s.yxyy: Vector4s get() = Vector4s(y, x, y, y)
val Vector4s.yxyz: Vector4s get() = Vector4s(y, x, y, z)
val Vector4s.yxyw: Vector4s get() = Vector4s(y, x, y, w)
val Vector4s.yxzx: Vector4s get() = Vector4s(y, x, z, x)
val Vector4s.yxzy: Vector4s get() = Vector4s(y, x, z, y)
val Vector4s.yxzz: Vector4s get() = Vector4s(y, x, z, z)
val Vector4s.yxzw: Vector4s get() = Vector4s(y, x, z, w)
val Vector4s.yxwx: Vector4s get() = Vector4s(y, x, w, x)
val Vector4s.yxwy: Vector4s get() = Vector4s(y, x, w, y)
val Vector4s.yxwz: Vector4s get() = Vector4s(y, x, w, z)
val Vector4s.yxww: Vector4s get() = Vector4s(y, x, w, w)
val Vector4s.yyxx: Vector4s get() = Vector4s(y, y, x, x)
val Vector4s.yyxy: Vector4s get() = Vector4s(y, y, x, y)
val Vector4s.yyxz: Vector4s get() = Vector4s(y, y, x, z)
val Vector4s.yyxw: Vector4s get() = Vector4s(y, y, x, w)
val Vector4s.yyyx: Vector4s get() = Vector4s(y, y, y, x)
val Vector4s.yyyy: Vector4s get() = Vector4s(y, y, y, y)
val Vector4s.yyyz: Vector4s get() = Vector4s(y, y, y, z)
val Vector4s.yyyw: Vector4s get() = Vector4s(y, y, y, w)
val Vector4s.yyzx: Vector4s get() = Vector4s(y, y, z, x)
val Vector4s.yyzy: Vector4s get() = Vector4s(y, y, z, y)
val Vector4s.yyzz: Vector4s get() = Vector4s(y, y, z, z)
val Vector4s.yyzw: Vector4s get() = Vector4s(y, y, z, w)
val Vector4s.yywx: Vector4s get() = Vector4s(y, y, w, x)
val Vector4s.yywy: Vector4s get() = Vector4s(y, y, w, y)
val Vector4s.yywz: Vector4s get() = Vector4s(y, y, w, z)
val Vector4s.yyww: Vector4s get() = Vector4s(y, y, w, w)
val Vector4s.yzxx: Vector4s get() = Vector4s(y, z, x, x)
val Vector4s.yzxy: Vector4s get() = Vector4s(y, z, x, y)
val Vector4s.yzxz: Vector4s get() = Vector4s(y, z, x, z)
val Vector4s.yzxw: Vector4s get() = Vector4s(y, z, x, w)
val Vector4s.yzyx: Vector4s get() = Vector4s(y, z, y, x)
val Vector4s.yzyy: Vector4s get() = Vector4s(y, z, y, y)
val Vector4s.yzyz: Vector4s get() = Vector4s(y, z, y, z)
val Vector4s.yzyw: Vector4s get() = Vector4s(y, z, y, w)
val Vector4s.yzzx: Vector4s get() = Vector4s(y, z, z, x)
val Vector4s.yzzy: Vector4s get() = Vector4s(y, z, z, y)
val Vector4s.yzzz: Vector4s get() = Vector4s(y, z, z, z)
val Vector4s.yzzw: Vector4s get() = Vector4s(y, z, z, w)
val Vector4s.yzwx: Vector4s get() = Vector4s(y, z, w, x)
val Vector4s.yzwy: Vector4s get() = Vector4s(y, z, w, y)
val Vector4s.yzwz: Vector4s get() = Vector4s(y, z, w, z)
val Vector4s.yzww: Vector4s get() = Vector4s(y, z, w, w)
val Vector4s.ywxx: Vector4s get() = Vector4s(y, w, x, x)
val Vector4s.ywxy: Vector4s get() = Vector4s(y, w, x, y)
val Vector4s.ywxz: Vector4s get() = Vector4s(y, w, x, z)
val Vector4s.ywxw: Vector4s get() = Vector4s(y, w, x, w)
val Vector4s.ywyx: Vector4s get() = Vector4s(y, w, y, x)
val Vector4s.ywyy: Vector4s get() = Vector4s(y, w, y, y)
val Vector4s.ywyz: Vector4s get() = Vector4s(y, w, y, z)
val Vector4s.ywyw: Vector4s get() = Vector4s(y, w, y, w)
val Vector4s.ywzx: Vector4s get() = Vector4s(y, w, z, x)
val Vector4s.ywzy: Vector4s get() = Vector4s(y, w, z, y)
val Vector4s.ywzz: Vector4s get() = Vector4s(y, w, z, z)
val Vector4s.ywzw: Vector4s get() = Vector4s(y, w, z, w)
val Vector4s.ywwx: Vector4s get() = Vector4s(y, w, w, x)
val Vector4s.ywwy: Vector4s get() = Vector4s(y, w, w, y)
val Vector4s.ywwz: Vector4s get() = Vector4s(y, w, w, z)
val Vector4s.ywww: Vector4s get() = Vector4s(y, w, w, w)
val Vector4s.zxxx: Vector4s get() = Vector4s(z, x, x, x)
val Vector4s.zxxy: Vector4s get() = Vector4s(z, x, x, y)
val Vector4s.zxxz: Vector4s get() = Vector4s(z, x, x, z)
val Vector4s.zxxw: Vector4s get() = Vector4s(z, x, x, w)
val Vector4s.zxyx: Vector4s get() = Vector4s(z, x, y, x)
val Vector4s.zxyy: Vector4s get() = Vector4s(z, x, y, y)
val Vector4s.zxyz: Vector4s get() = Vector4s(z, x, y, z)
val Vector4s.zxyw: Vector4s get() = Vector4s(z, x, y, w)
val Vector4s.zxzx: Vector4s get() = Vector4s(z, x, z, x)
val Vector4s.zxzy: Vector4s get() = Vector4s(z, x, z, y)
val Vector4s.zxzz: Vector4s get() = Vector4s(z, x, z, z)
val Vector4s.zxzw: Vector4s get() = Vector4s(z, x, z, w)
val Vector4s.zxwx: Vector4s get() = Vector4s(z, x, w, x)
val Vector4s.zxwy: Vector4s get() = Vector4s(z, x, w, y)
val Vector4s.zxwz: Vector4s get() = Vector4s(z, x, w, z)
val Vector4s.zxww: Vector4s get() = Vector4s(z, x, w, w)
val Vector4s.zyxx: Vector4s get() = Vector4s(z, y, x, x)
val Vector4s.zyxy: Vector4s get() = Vector4s(z, y, x, y)
val Vector4s.zyxz: Vector4s get() = Vector4s(z, y, x, z)
val Vector4s.zyxw: Vector4s get() = Vector4s(z, y, x, w)
val Vector4s.zyyx: Vector4s get() = Vector4s(z, y, y, x)
val Vector4s.zyyy: Vector4s get() = Vector4s(z, y, y, y)
val Vector4s.zyyz: Vector4s get() = Vector4s(z, y, y, z)
val Vector4s.zyyw: Vector4s get() = Vector4s(z, y, y, w)
val Vector4s.zyzx: Vector4s get() = Vector4s(z, y, z, x)
val Vector4s.zyzy: Vector4s get() = Vector4s(z, y, z, y)
val Vector4s.zyzz: Vector4s get() = Vector4s(z, y, z, z)
val Vector4s.zyzw: Vector4s get() = Vector4s(z, y, z, w)
val Vector4s.zywx: Vector4s get() = Vector4s(z, y, w, x)
val Vector4s.zywy: Vector4s get() = Vector4s(z, y, w, y)
val Vector4s.zywz: Vector4s get() = Vector4s(z, y, w, z)
val Vector4s.zyww: Vector4s get() = Vector4s(z, y, w, w)
val Vector4s.zzxx: Vector4s get() = Vector4s(z, z, x, x)
val Vector4s.zzxy: Vector4s get() = Vector4s(z, z, x, y)
val Vector4s.zzxz: Vector4s get() = Vector4s(z, z, x, z)
val Vector4s.zzxw: Vector4s get() = Vector4s(z, z, x, w)
val Vector4s.zzyx: Vector4s get() = Vector4s(z, z, y, x)
val Vector4s.zzyy: Vector4s get() = Vector4s(z, z, y, y)
val Vector4s.zzyz: Vector4s get() = Vector4s(z, z, y, z)
val Vector4s.zzyw: Vector4s get() = Vector4s(z, z, y, w)
val Vector4s.zzzx: Vector4s get() = Vector4s(z, z, z, x)
val Vector4s.zzzy: Vector4s get() = Vector4s(z, z, z, y)
val Vector4s.zzzz: Vector4s get() = Vector4s(z, z, z, z)
val Vector4s.zzzw: Vector4s get() = Vector4s(z, z, z, w)
val Vector4s.zzwx: Vector4s get() = Vector4s(z, z, w, x)
val Vector4s.zzwy: Vector4s get() = Vector4s(z, z, w, y)
val Vector4s.zzwz: Vector4s get() = Vector4s(z, z, w, z)
val Vector4s.zzww: Vector4s get() = Vector4s(z, z, w, w)
val Vector4s.zwxx: Vector4s get() = Vector4s(z, w, x, x)
val Vector4s.zwxy: Vector4s get() = Vector4s(z, w, x, y)
val Vector4s.zwxz: Vector4s get() = Vector4s(z, w, x, z)
val Vector4s.zwxw: Vector4s get() = Vector4s(z, w, x, w)
val Vector4s.zwyx: Vector4s get() = Vector4s(z, w, y, x)
val Vector4s.zwyy: Vector4s get() = Vector4s(z, w, y, y)
val Vector4s.zwyz: Vector4s get() = Vector4s(z, w, y, z)
val Vector4s.zwyw: Vector4s get() = Vector4s(z, w, y, w)
val Vector4s.zwzx: Vector4s get() = Vector4s(z, w, z, x)
val Vector4s.zwzy: Vector4s get() = Vector4s(z, w, z, y)
val Vector4s.zwzz: Vector4s get() = Vector4s(z, w, z, z)
val Vector4s.zwzw: Vector4s get() = Vector4s(z, w, z, w)
val Vector4s.zwwx: Vector4s get() = Vector4s(z, w, w, x)
val Vector4s.zwwy: Vector4s get() = Vector4s(z, w, w, y)
val Vector4s.zwwz: Vector4s get() = Vector4s(z, w, w, z)
val Vector4s.zwww: Vector4s get() = Vector4s(z, w, w, w)
val Vector4s.wxxx: Vector4s get() = Vector4s(w, x, x, x)
val Vector4s.wxxy: Vector4s get() = Vector4s(w, x, x, y)
val Vector4s.wxxz: Vector4s get() = Vector4s(w, x, x, z)
val Vector4s.wxxw: Vector4s get() = Vector4s(w, x, x, w)
val Vector4s.wxyx: Vector4s get() = Vector4s(w, x, y, x)
val Vector4s.wxyy: Vector4s get() = Vector4s(w, x, y, y)
val Vector4s.wxyz: Vector4s get() = Vector4s(w, x, y, z)
val Vector4s.wxyw: Vector4s get() = Vector4s(w, x, y, w)
val Vector4s.wxzx: Vector4s get() = Vector4s(w, x, z, x)
val Vector4s.wxzy: Vector4s get() = Vector4s(w, x, z, y)
val Vector4s.wxzz: Vector4s get() = Vector4s(w, x, z, z)
val Vector4s.wxzw: Vector4s get() = Vector4s(w, x, z, w)
val Vector4s.wxwx: Vector4s get() = Vector4s(w, x, w, x)
val Vector4s.wxwy: Vector4s get() = Vector4s(w, x, w, y)
val Vector4s.wxwz: Vector4s get() = Vector4s(w, x, w, z)
val Vector4s.wxww: Vector4s get() = Vector4s(w, x, w, w)
val Vector4s.wyxx: Vector4s get() = Vector4s(w, y, x, x)
val Vector4s.wyxy: Vector4s get() = Vector4s(w, y, x, y)
val Vector4s.wyxz: Vector4s get() = Vector4s(w, y, x, z)
val Vector4s.wyxw: Vector4s get() = Vector4s(w, y, x, w)
val Vector4s.wyyx: Vector4s get() = Vector4s(w, y, y, x)
val Vector4s.wyyy: Vector4s get() = Vector4s(w, y, y, y)
val Vector4s.wyyz: Vector4s get() = Vector4s(w, y, y, z)
val Vector4s.wyyw: Vector4s get() = Vector4s(w, y, y, w)
val Vector4s.wyzx: Vector4s get() = Vector4s(w, y, z, x)
val Vector4s.wyzy: Vector4s get() = Vector4s(w, y, z, y)
val Vector4s.wyzz: Vector4s get() = Vector4s(w, y, z, z)
val Vector4s.wyzw: Vector4s get() = Vector4s(w, y, z, w)
val Vector4s.wywx: Vector4s get() = Vector4s(w, y, w, x)
val Vector4s.wywy: Vector4s get() = Vector4s(w, y, w, y)
val Vector4s.wywz: Vector4s get() = Vector4s(w, y, w, z)
val Vector4s.wyww: Vector4s get() = Vector4s(w, y, w, w)
val Vector4s.wzxx: Vector4s get() = Vector4s(w, z, x, x)
val Vector4s.wzxy: Vector4s get() = Vector4s(w, z, x, y)
val Vector4s.wzxz: Vector4s get() = Vector4s(w, z, x, z)
val Vector4s.wzxw: Vector4s get() = Vector4s(w, z, x, w)
val Vector4s.wzyx: Vector4s get() = Vector4s(w, z, y, x)
val Vector4s.wzyy: Vector4s get() = Vector4s(w, z, y, y)
val Vector4s.wzyz: Vector4s get() = Vector4s(w, z, y, z)
val Vector4s.wzyw: Vector4s get() = Vector4s(w, z, y, w)
val Vector4s.wzzx: Vector4s get() = Vector4s(w, z, z, x)
val Vector4s.wzzy: Vector4s get() = Vector4s(w, z, z, y)
val Vector4s.wzzz: Vector4s get() = Vector4s(w, z, z, z)
val Vector4s.wzzw: Vector4s get() = Vector4s(w, z, z, w)
val Vector4s.wzwx: Vector4s get() = Vector4s(w, z, w, x)
val Vector4s.wzwy: Vector4s get() = Vector4s(w, z, w, y)
val Vector4s.wzwz: Vector4s get() = Vector4s(w, z, w, z)
val Vector4s.wzww: Vector4s get() = Vector4s(w, z, w, w)
val Vector4s.wwxx: Vector4s get() = Vector4s(w, w, x, x)
val Vector4s.wwxy: Vector4s get() = Vector4s(w, w, x, y)
val Vector4s.wwxz: Vector4s get() = Vector4s(w, w, x, z)
val Vector4s.wwxw: Vector4s get() = Vector4s(w, w, x, w)
val Vector4s.wwyx: Vector4s get() = Vector4s(w, w, y, x)
val Vector4s.wwyy: Vector4s get() = Vector4s(w, w, y, y)
val Vector4s.wwyz: Vector4s get() = Vector4s(w, w, y, z)
val Vector4s.wwyw: Vector4s get() = Vector4s(w, w, y, w)
val Vector4s.wwzx: Vector4s get() = Vector4s(w, w, z, x)
val Vector4s.wwzy: Vector4s get() = Vector4s(w, w, z, y)
val Vector4s.wwzz: Vector4s get() = Vector4s(w, w, z, z)
val Vector4s.wwzw: Vector4s get() = Vector4s(w, w, z, w)
val Vector4s.wwwx: Vector4s get() = Vector4s(w, w, w, x)
val Vector4s.wwwy: Vector4s get() = Vector4s(w, w, w, y)
val Vector4s.wwwz: Vector4s get() = Vector4s(w, w, w, z)
val Vector4s.wwww: Vector4s get() = Vector4s(w, w, w, w)