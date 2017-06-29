/*
 * Copyright (c) 2017 Nam Nguyen, nam@ene.im
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.ene.toro.sample.legacy

import android.net.Uri

/**
 * @author eneim (6/26/17).
 */
data class VideoData(val mediaUri: Uri, val index: Int) {

  companion object {
    val MP4_BUNNY = "http://dash.edgesuite.net/akamai/bbb_30fps/bbb_30fps_768x432_1500k.mp4"
    fun newInstance(index: Int) = VideoData(Uri.parse(MP4_BUNNY), index)
  }
}